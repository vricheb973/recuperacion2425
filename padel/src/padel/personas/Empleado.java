package padel.personas;

public class Empleado extends Persona {
	
	private int codEmpleado;
	
	public Empleado(String nombre, String apellidos, String dni, int codEmpleado) {
		super(nombre, apellidos, dni);
		this.codEmpleado = codEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado[nombre=" +this.getNombre() +", apellidos=" + this.getApellidos() +
				", dni=" + this.getDni() + ", codEmpleado=" + this.codEmpleado + "]"; 
	}

	@Override
	public void saludar() {
		System.out.println("Hola, mi nombre es " + this.getNombre() + " y soy un empleado ");
	}

}
