package padel.instalaciones;

import padel.instalaciones.enums.TipoPista;
import padel.instalaciones.enums.UbicacionPista;

public class Pista {
	
	private int numPista;
	private TipoPista tipoPista;
	private UbicacionPista ubicacionPista;
	
	public Pista(int numPista, String tipoPista, String ubicacionPista) {
		setNumPista(numPista);
		setTipoPista(tipoPista);
		setUbicacionPista(ubicacionPista);
	}
	
	public int getNumPista() {
		return this.numPista;
	}
	
	public void setNumPista(int numPista) {
		if(numPista < 1) {
			throw new IllegalArgumentException("El número de pista debe ser un entero positivo. ");
		}
		this.numPista = numPista;
	}
	
	public String getTipoPista() {
		return this.tipoPista.toString();
	}
	
	public void setTipoPista(String tipoPista) {
		this.tipoPista = TipoPista.valueOf(tipoPista);
	}
	
	public String getUbicacionPista() {
		return this.ubicacionPista.toString();
	}
	
	public void setUbicacionPista(String ubicacionPista) {
		this.ubicacionPista = UbicacionPista.valueOf(ubicacionPista);
	}

}
