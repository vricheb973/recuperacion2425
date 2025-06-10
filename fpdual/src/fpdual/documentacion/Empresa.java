package fpdual.documentacion;

public class Empresa implements  Contratable, Comparable<Empresa> {
	
	private String nombre;
	private String cif;
	private int numTrabajadores;
	private String direccion;
	private String localidad;
	
	private static String ultimoCif = "";
	
	public Empresa(String nombre, String cif, int numTrabajadores, String direccion, String localidad) {
		this.nombre = nombre;
		this.cif = cif;
		setNumTrabajadores(numTrabajadores);
		this.direccion = direccion;
		this.localidad = localidad;
		
		ultimoCif = cif;
	}
	
	public int getNumTrabajadores() {
		return this.numTrabajadores;
	}
	
	public void setNumTrabajadores(int numTrabajadores) {
		if(numTrabajadores < 2) {
			throw new IllegalArgumentException("La empresa deben tener al menos 2 trabajadores.");
		}
		
		this.numTrabajadores = numTrabajadores;
	}
	
	@Override
	public void contratar(int cantidad) {
		this.numTrabajadores += cantidad;
	}
	
	@Override
	public void despedir(int cantidad) {
		if(this.numTrabajadores - cantidad < 2) {
			throw new IllegalArgumentException("La empresa deben tener al menos 2 trabajadores.");
		}
		
		this.numTrabajadores -= cantidad;
	}

	@Override
	public int compareTo(Empresa o) {
		//mayor a menor número de trabajadores
		int result = o.numTrabajadores - this.numTrabajadores;
		
		//cif en orden alfabético
		if(result == 0) {
			result = this.cif.compareTo(o.cif);
		}
		
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
