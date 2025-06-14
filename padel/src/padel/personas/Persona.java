package padel.personas;

public abstract class Persona implements Comparable<Persona> {
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		setDni(dni);
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public void setDni(String dni) {
		if(dni == null || dni.length() != 9) {
			throw new IllegalArgumentException("El DNI debe tener exactamente 9 caracteres. ");
		}
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}		
		
		Persona other = (Persona) obj;			
		return this.dni.equals(other.dni);
	}

	@Override
	public int compareTo(Persona o) {
		int result = this.nombre.compareTo(o.nombre);
		
		if(result == 0) {
			result = this.dni.compareTo(o.dni);
		}

		return result;
	}
	
//	public void saludar() {
//		System.out.println("Hola, mi nombre es" + this.nombre + " y soy " + this.getClass());
//	}
	
	public abstract void saludar();

}
