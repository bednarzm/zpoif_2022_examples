package pl.edu.pw.mini.zpoif.graded.second.main.investigator;

import pl.edu.pw.mini.zpoif.graded.second.main.interrogated.Interrogated;

public abstract class Investigator {
	
	public void interrogate(Interrogated interrogated) {
		interrogated.interrogateMe();
		System.out.println("I have interrogated " + interrogated.toString());
	}
	
}
