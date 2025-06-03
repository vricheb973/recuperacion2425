package padel.personas;

public class Jugador extends Persona {
	
	private int codSocio;

	public Jugador(String nombre, String apellidos, String dni, int codSocio) {
		super(nombre, apellidos, dni);
		this.codSocio = codSocio;
	}
	
	//ESTO NO HACE FALTA
	public int getCodSocio() {
		return codSocio;
	}

	public void setCodSocio(int codSocio) {
		this.codSocio = codSocio;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}		
		
		Jugador other = (Jugador) obj;			
		return super.equals(other) && this.codSocio == other.codSocio;
	}
	
	

}
