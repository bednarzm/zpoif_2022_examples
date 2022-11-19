package pl.edu.pw.mini.zpoif.graded.fourth.lab;

import java.util.Map.Entry;

import pl.edu.pw.mini.zpoif.graded.fourth.auta.Samochod;
import pl.edu.pw.mini.zpoif.graded.fourth.generator.GeneratorSamochodow;

public class Demonstrator {
	public static void main(String[] args)
	{
		KlasaImplementujacaStrumienie k = new KlasaImplementujacaStrumienie(GeneratorSamochodow.generateAll());
		System.out.println("Najdluzszy samochód: "+k.getNajdluzszySamochod().toString());
		System.out.println("\nNajwê¿szy: "+k.getSamochodONajmniejszejSzerokosci().toString());
		System.out.println("\nNajl¿ejszy samochód w³oski: "+k.getNajlzejszySamochodWloski().toString());
		System.out.println("\nCo najwyzej 3 samochody mieszczace sie w garazu 500x160x150:");
		for(Samochod s: k.getCoNajwyzej3ZSamochodowMieszczacychSieWGarazu())
		{
			System.out.println(s.toString());
		}
		System.out.println("\nSamochody posortowane malejaco wzgledem masy minus suma wymiarów:");
		for(Samochod s: k.getSamochodyPosortowaneMalejacoWzgledemMasyPomniejszonejOSumeWymiarow())
		{
			System.out.println(s.toString()+" = "+(s.getMasaWlasna()-(s.getDlogosc()+s.getWysokosc()+s.getSzerokosc())));
		}
		System.out.println("\nSamochody nie lzejsze niz 1000kg i nie szersze niz 170cm:");
		for(Samochod s: k.getSamochodyNieLzejszeNiz1000KgINieSzerszeNiz170())
		{
			System.out.println(s.toString());
		}
		System.out.println("\nPierwsze piec z posortowanych malejaco niemieckich wzgledem wysokosci:");
		for(Samochod s: k.getPierwszePiecZPosortowanychMalejacoSNWzglWysok())
		{
			System.out.println(s.toString());
		}
		System.out.println("\nSuma szerokosci japonskich nie ciezszych niz 1000kg bez 2 pierwszych: "+k.getSumaSzerokosciSamochodowJaponskichNieCiezszychNiz1000kgBezDwochPierwszych());
		System.out.println("\nCo najwyzej 4 posortowane malejaco po masie zaczynajac od 10-tego:");
		for(Samochod s: k.getCoNajwyzej4ZPosortowanychMalejacoWzglMasyPoczawszyOd10tego())
		{
			System.out.println(s.toString());
		}
		System.out.println("\nMapowanie wloskich samochodow marka -> samochod:");
		for(Entry<String,Samochod> s: k.mapujModelNaSamochodTylkoWloskie().entrySet())
		{
			System.out.println(s.getKey()+" -> "+s.getValue());
		}
		System.out.println("\nJaponskie samochody zamienione na ich masy:");
		for(int i: k.getJaponskieSamochodyZamienioneNaWartosciIchMasy())
		{
			System.out.println(i);
		}
	}
}
