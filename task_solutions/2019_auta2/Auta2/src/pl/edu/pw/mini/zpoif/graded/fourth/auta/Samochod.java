package pl.edu.pw.mini.zpoif.graded.fourth.auta;

public abstract class Samochod {
	
	protected String marka;
	protected char dlogosc;
	protected char szerokosc;
	protected char wysokosc;
	protected char masaWlasna;
	protected boolean bezawaryjnosc;
	protected byte prestiz;
	
	public Samochod(String marka, char dlogosc, char szerokosc, char wysokosc, char masaWlasna, boolean bezawaryjnosc,
			byte prestiz) {
		super();
		this.marka = marka;
		this.dlogosc = dlogosc;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.masaWlasna = masaWlasna;
		this.bezawaryjnosc = bezawaryjnosc;
		this.prestiz = prestiz;
	}

	public String getMarka() {
		return marka;
	}
	
	public int getDlogosc() {
		return dlogosc;
	}
	
	public int getSzerokosc() {
		return szerokosc;
	}
	
	public int getWysokosc() {
		return wysokosc;
	}
	
	public int getMasaWlasna() {
		return masaWlasna;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dlogosc;
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + masaWlasna;
		result = prime * result + szerokosc;
		result = prime * result + wysokosc;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Samochod other = (Samochod) obj;
		if (dlogosc != other.dlogosc)
			return false;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (masaWlasna != other.masaWlasna)
			return false;
		if (szerokosc != other.szerokosc)
			return false;
		if (wysokosc != other.wysokosc)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Samochod [marka=" + marka + ", dlogosc=" + (int)dlogosc + ", szerokosc=" + (int)szerokosc + ", wysokosc="
				+ (int)wysokosc + ", masaWlasna=" + (int)masaWlasna + "]";
	}
	
}
