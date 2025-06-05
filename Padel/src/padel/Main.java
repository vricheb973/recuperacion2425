package padel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import padel.personas.Amateur;
import padel.personas.ComparaJugadores;
import padel.personas.Jugador;
import padel.personas.Profesional;

public class Main {

	public static void main(String[] args) {
		
		// Profesionales
		Profesional p1 = new Profesional("Ana", "García López", "12345678A", 101, "Estrategia");
		Profesional p2 = new Profesional("Luis", "Martínez Pérez", "87654321B", 102, "Comunicación");
		Profesional p3 = new Profesional("Ana", "Sánchez Ruiz", "11223344C", 103, "Resolución de problemas");

		// Amateurs
		Amateur a1 = new Amateur("Javier", "Fernández Gómez", "55667788D", 201, "Impaciencia");
		Amateur a2 = new Amateur("Lucía", "Torres Molina", "99887766E", 202, "Falta de experiencia");
		Amateur a3 = new Amateur("Luis", "García López", "22334455F", 203, "Desorganización");	
		
		List<Jugador> personas = Arrays.asList(p1,p2,p3,a1,a2,a3);
		
		System.out.println("Antes de ordenar:");
		System.out.println(personas);
		
		ComparaJugadores c1 = new ComparaJugadores();		

		System.out.println("Después de ordenar:");
		Collections.sort(personas, c1);
		System.out.println(personas);
		
		

	}

}
