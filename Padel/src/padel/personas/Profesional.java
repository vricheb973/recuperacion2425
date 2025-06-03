package padel.personas;

public class Profesional extends Jugador {
	
	private String puntoFuerte;

	public Profesional(String nombre, String apellidos, String dni, int codSocio, String puntoFuerte) {
		super(nombre, apellidos, dni, codSocio);
		this.puntoFuerte = puntoFuerte;
	}
	
	@Override
	public String toString() {
		return String.format("Profesional[nombre=%s, apellidos=%s, "
				+ "dni=%s, cod=%d, puntoFuerte=%s]", this.getNombre(), this.getApellidos()
				, this.getDni(), this.getCodSocio(), this.puntoFuerte);
	}

}
