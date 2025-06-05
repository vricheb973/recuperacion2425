package padel.personas;

public class Amateur extends Jugador {
	
	private String puntoDebil;

	public Amateur(String nombre, String apellidos, String dni, int codSocio, String puntoDebil) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoDebil = puntoDebil;
	}

	@Override
	public String toString() {
		return String.format("Amateur[nombre=%s, apellidos=%s, "
				+ "dni=%s, cod=%d, puntoDebil=%s]", this.getNombre(), this.getApellidos()
				, this.getDni(), this.getCodSocio(), this.puntoDebil);
	}

	@Override
	public void saludar() {
		System.out.println("Hola, mi nombre es " + this.getNombre() + " y soy un amateur ");
	}	

}
