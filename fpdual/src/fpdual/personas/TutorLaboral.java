package fpdual.personas;

import fpdual.personas.enums.CargoLaboral;

public class TutorLaboral extends Tutor {

	private CargoLaboral cargo;

	public TutorLaboral(String nombre, String apellidos, String dni, String email, CargoLaboral cargo) {
		super(nombre, apellidos, dni, email);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo.toString();
	}

	public void setCargo(String cargo) {
		this.cargo = CargoLaboral.valueOf(cargo);
	}
	
	@Override
	public String toString() {
		return "TutorLaboral [nombre=" + this.getNombre() + 
				", apellidos=" + this.getApellidos() + 
				", dni=" + this.getDni() + 
				", email=" + this.getEmail() +
				", cargo" + this.cargo.toString() + "]";
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, me llamo " + this.getNombre() + " y soy tutor laboral. ");
	}

}
