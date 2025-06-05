package fpdual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fpdual.personas.TutorLaboral;

public class Main {

	public static void main(String[] args) {

		List<TutorLaboral> laborales = new ArrayList<TutorLaboral>();
		
		Collections.sort(laborales, (o1, o2) -> { 
			int result = o1.getCargo().compareTo(o2.getCargo());
			
			if(result == 0) {
				result = o1.getApellidos().compareTo(o2.getApellidos());
			}
			
			return result;			
		});

	}

}
