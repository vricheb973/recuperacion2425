package padel.personas;

import java.util.Comparator;

public class ComparaJugadores implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		int result = o1.getNombre().compareTo(o2.getNombre());
		
		if(result == 0) {
//			result = Integer.compare(o1.getCodSocio(), o2.getCodSocio());
			result = o2.getCodSocio() - o1.getCodSocio();
		}
		
		return result;
	}

}
