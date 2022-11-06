package pl.edu.pw.mini.zpoif.graded.second.main.station;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import pl.edu.pw.mini.zpoif.graded.second.main.interrogated.Interrogated;

public class Demonstrator {
	
	private static final byte numberOfInterrogatedPeople = 5;
	
	private List<String> names = Arrays.asList("Alicja", "Maciek", "Piotrek", "Zbych", "Adam", "Joanna", "Zuzanna");
	private List<String> surnames = Arrays.asList("Johnson", "Bryl", "Opala", "Tkaczyk", "Witkek", "Dzwon");
	private List<String> pseudonyms = Arrays.asList("Halo", "Ogrodnik", "Halina", "Kapo", "Macho");
			
	public static void main(String[] args) {
		Demonstrator demonstrator = new Demonstrator();
		Demonstrator.InterrogatedGenearator igen = demonstrator.new InterrogatedGenearator();
		PoliceStation policeStation = new MyPoliceStation();
		List<Interrogated> interrogatedPeople = igen.gen();
		policeStation.handleInterrogatedPeople(interrogatedPeople);
	}

	private class InterrogatedGenearator {

		private String randomName(){
			Random random = new Random();
			return Demonstrator.this.names.get(random.nextInt(Demonstrator.this.names.size()));
		}

		private String randomSurname(){
			Random random = new Random();
			return Demonstrator.this.surnames.get(random.nextInt(Demonstrator.this.surnames.size()));
		}

		private String randomPseudonym(){
			Random random = new Random();
			return Demonstrator.this.pseudonyms.get(random.nextInt(Demonstrator.this.pseudonyms.size()));
		}

		public List<Interrogated> gen(){
			List<Interrogated> list = new ArrayList<Interrogated>();
			for (int i = 0; i < numberOfInterrogatedPeople; i++) {
				list.add(new Interrogated.Witness(this.randomName(), this.randomSurname()));
				list.add(new Interrogated.SecretAgent(this.randomPseudonym()));
				list.add(new Interrogated.Suspect(this.randomName(), this.randomSurname()));
			}
			return list;
		}
	}
}
