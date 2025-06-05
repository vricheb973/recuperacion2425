package fpdual.personas;

public class Alumno extends Persona {
	
	private String numSS;

	public Alumno(String nombre, String apellidos, String dni, String numSS) {
		super(nombre, apellidos, dni);
		this.numSS = numSS;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + this.getNombre() + 
				", apellidos=" + this.getApellidos() + 
				", dni=" + this.getDni() + 
				" ,numSS=" + this.numSS + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Alumno otro = (Alumno) obj;
		return this.getDni().equals(otro.getDni()) && this.numSS.equals(otro.numSS);		
	}
	
	@Override
	public void saludar() {
		System.out.println("Hola, me llamo " + this.getNombre() + " y soy alumno. ");
	}

}
