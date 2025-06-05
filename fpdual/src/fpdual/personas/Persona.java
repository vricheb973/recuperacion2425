package fpdual.personas;

public abstract class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		setDni(dni);
	}
	
	//NO ES NECESARIO
	public String getNombre() {
		return nombre;
	}

	//NO ES NECESARIO
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//NO ES NECESARIO
	public String getApellidos() {
		return apellidos;
	}

	//NO ES NECESARIO
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if(dni == null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI debe tener exactamente 9 caracteres. ");
		}
		this.dni = dni;
	}
	
	public abstract void saludar();
	
}
