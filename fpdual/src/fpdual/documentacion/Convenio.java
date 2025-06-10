package fpdual.documentacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fpdual.personas.Alumno;
import fpdual.personas.TutorDocente;
import fpdual.personas.TutorLaboral;

public class Convenio {
	
	private int codigo;
	private Empresa empresa;
	private int numAlumnos;
	private List<Alumno> alumnos;
	private LocalDateTime firmaDocente;
	private LocalDateTime firmaLaboral;
	private TutorDocente tutorDocente;
	private TutorLaboral tutorLaboral;
	
	private static int contador = 1;
	
	public Convenio(Empresa empresa, int numAlumnos) {
		if(empresa.getNumTrabajadores() < numAlumnos * 2) {
			throw new IllegalArgumentException("Debe haber al menos 2 empleados por cada alumno que asignemos");
		}
		
		this.codigo = contador++;
		this.empresa = empresa;
		this.numAlumnos = numAlumnos;
		this.alumnos = new ArrayList<Alumno>();
		this.firmaDocente = null;
		this.firmaLaboral = null;
		this.tutorDocente = null;
		this.tutorLaboral = null;
		
	}
	
	public boolean completo() {		
		return this.numAlumnos == this.alumnos.size();
	}
	
	public void resumen() {
		System.out.print("Estado: ");
		if(this.firmaDocente != null && this.firmaLaboral != null) {
			System.out.println("FIRMADO");
		}
		else {
			System.out.println("PENDIENTE");
		}
		System.out.println("Alumnos: " + this.numAlumnos);
		for(Alumno a : this.alumnos) {
			System.out.println("- " + a.getApellidos() +", " + a.getNombre());
		}
	}
	
	public void incluirAlumno(Alumno a) {
		if(this.alumnos.contains(a)) {
			throw new IllegalArgumentException("El alumno ya está en el convenio. ");
		}
		if(completo()) {
			throw new IllegalArgumentException("El alumno no cabe en el convenio. ");
		}
		if(this.firmaDocente != null && this.firmaLaboral != null) {
			throw new IllegalArgumentException("No se pueden añadir alumnos a un convenio que esté firmado. ");
		}
		
		this.alumnos.add(a);
	}
	
	public void retirarAlumno(int posicion) {
		if(posicion < 0 || posicion >= this.alumnos.size()) {
			throw new IllegalArgumentException("La posición indicada no existe. ");
		}
		if(this.firmaDocente != null && this.firmaLaboral != null) {
			throw new IllegalArgumentException("No se pueden retirar alumnos a un convenio que esté firmado. ");
		}
		this.alumnos.remove(posicion);
	}
	
	public void firmar(TutorDocente tutorDocente) {
		if(this.firmaDocente != null) {
			throw new IllegalArgumentException("El tutor docente ya ha firmado. ");
		}
		if(!completo()) {
			throw new IllegalArgumentException("Quedan alumnos por asignar. ");
		}
		this.firmaDocente = LocalDateTime.now();
		this.tutorDocente = tutorDocente;
	}
	
	public void firmar(TutorLaboral tutorLaboral) {
		if(this.firmaLaboral != null) {
			throw new IllegalArgumentException("El tutor laboral ya ha firmado. ");
		}
		if(!completo()) {
			throw new IllegalArgumentException("Quedan alumnos por asignar. ");
		}
		this.firmaLaboral = LocalDateTime.now();
		this.tutorLaboral = tutorLaboral;
	}
	
	
	
	
	
	
	
	
}
