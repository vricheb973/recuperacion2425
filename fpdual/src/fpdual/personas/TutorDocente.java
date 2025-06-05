package fpdual.personas;

import fpdual.personas.enums.EspecialidadDocente;

public class TutorDocente extends Tutor {
	
	private EspecialidadDocente especialidad;

	public TutorDocente(String nombre, String apellidos, String dni, String email, EspecialidadDocente especialidad) {
		super(nombre, apellidos, dni, email);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad.toString();
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = EspecialidadDocente.valueOf(especialidad);
	}
	
	@Override
	public String toString() {
		return "TutorDocente [nombre=" + this.getNombre() + 
				", apellidos=" + this.getApellidos() + 
				", dni=" + this.getDni() + 
				", email=" + this.getEmail() +
				", especialidad" + this.especialidad.toString() + "]";
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, me llamo " + this.getNombre() + " y soy tutor docente. ");
	}	

}
