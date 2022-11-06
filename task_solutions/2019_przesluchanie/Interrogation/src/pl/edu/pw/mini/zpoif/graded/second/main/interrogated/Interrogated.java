package pl.edu.pw.mini.zpoif.graded.second.main.interrogated;

public abstract class Interrogated {
	public abstract void interrogateMe();

	public static class Witness extends Interrogated {
		private String name;
		private String surname;

		public Witness(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		@Override
		public String toString() {
			return "Witness{" +
					"name='" + name + '\'' +
					", surname='" + surname + '\'' +
					'}';
		}

		@Override
		public void interrogateMe() {
			System.out.println("Jestem Przesłuchiwany. Świadek. " + this.toString());
		}
	}

	public static class SecretAgent extends Interrogated {
		private String nick;

		public SecretAgent(String nick) {
			this.nick = nick;
		}

		@Override
		public String toString() {
			return "SecretAgent{" +
					"nick='" + nick + '\'' +
					'}';
		}

		@Override
		public void interrogateMe() {
			System.out.println("Jestem Przesłuchiwany. Tajny agent. " + this.toString());
		}
	}
	public static class Suspect extends Interrogated {
		private String name;
		private String surname;

		public Suspect(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		@Override
		public String toString() {
			class hideSurname {
				public String hide(String name, String surname) {
					return name + (surname.length() > 0 ? " " + surname.toUpperCase().charAt(0) + "." : "");
				}
			}
			return "Suspect{" +
					"name='" + new hideSurname().hide(this.name, this.surname) + '\'' +
					'}';
		}

		@Override
		public void interrogateMe() {
			System.out.println("Jestem Przesłuchiwany. Podejrzany. " + this.toString());
		}
	}
}
