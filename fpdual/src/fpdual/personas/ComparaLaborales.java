package fpdual.personas;

import java.util.Comparator;

public class ComparaLaborales implements Comparator<TutorLaboral> {

	@Override
	public int compare(TutorLaboral o1, TutorLaboral o2) {
		int result = o1.getCargo().compareTo(o2.getCargo());
		
		if(result == 0) {
			result = o1.getApellidos().compareTo(o2.getApellidos());
		}
		
		return result;
	}

}
