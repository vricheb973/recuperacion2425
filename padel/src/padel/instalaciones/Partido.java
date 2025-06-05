package padel.instalaciones;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import padel.personas.Empleado;
import padel.personas.Jugador;

public class Partido {
	
	private int codigo;
	private Pista pista;
	private int numJugadores;
	private List<Jugador> jugadores;
	private LocalDateTime firmaEmpleado;
	private LocalDateTime firmaJugadores;
	private Empleado empleado;
	
	private static int contador = 1;

	public Partido(Pista pista, int numJugadores) {
		this.codigo = contador++; 
		this.pista = pista;
		this.numJugadores = numJugadores;
		this.jugadores = new ArrayList<Jugador>();
		this.firmaEmpleado = null;
		this.firmaJugadores = null;
		this.empleado = null;		
	}
	
	public int getNumJugadores() {
		return this.numJugadores;
	}
	
	public void setNumJugadores(int numJugadores) {
		if(numJugadores < 2 || numJugadores % 2 != 0) {
			throw new IllegalArgumentException("Deben jugar al menos dos jugadores o parejas completas.");
		}
		this.numJugadores = numJugadores;
	}
	
	public boolean completo() {
		return this.numJugadores == this.jugadores.size();
	}
	
	public void asociarJugador(Jugador j) {
		if(completo()) {
			throw new IllegalArgumentException("El equipo está completo. ");
		}
		if(this.jugadores.contains(j)) {
			throw new IllegalArgumentException("El jugador " + j.getNombre() + " está ya dentro. ");
		}
		this.jugadores.add(j);
	}
	
	public void eliminarJugador(int posicion) {
		if(this.firmaJugadores != null || this.firmaEmpleado != null) {
			throw new IllegalArgumentException("No se pueden eliminar jugadores porque ya está firmado.");
		}
		if(posicion < 0 || posicion > this.jugadores.size()-1 ) {
			throw new IllegalArgumentException("La posición indicada no existe. ");
		}
		this.jugadores.remove(posicion);
	}
	
	public String estado() {
		String estado = "PENDIENTE";
		
		if(this.firmaJugadores != null) {
			estado = "RESERVADO";
		}
		if(this.firmaEmpleado != null) {
			estado = "CONFIRMADO";
		}
		
		return estado;
	}
	
	public void reservar() {
		if(!completo()) {
			throw new IllegalArgumentException("El equipo no está completo. ");
		}
		if(this.firmaJugadores != null) {
			throw new IllegalArgumentException("Los jugadores ya han reservado. ");
		}
		
		this.firmaJugadores = LocalDateTime.now();
	}
	
	public void reservar(Empleado empleado) {
		if(this.firmaJugadores == null) {
			throw new IllegalArgumentException("Primero tienen que reservar los jugadores. ");
		}
		if(this.firmaEmpleado != null) {
			throw new IllegalArgumentException("El empleado ya ha reservado. ");
		}
		
		this.firmaEmpleado = LocalDateTime.now();
		this.empleado = empleado;
	}
	
}
