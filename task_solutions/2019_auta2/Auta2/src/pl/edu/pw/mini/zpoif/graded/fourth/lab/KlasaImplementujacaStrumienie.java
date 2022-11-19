package pl.edu.pw.mini.zpoif.graded.fourth.lab;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pl.edu.pw.mini.zpoif.graded.fourth.auta.Samochod;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodJaponski;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodNiemiecki;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodWloski;
import pl.edu.pw.mini.zpoif.graded.fourth.generator.Strumienie;

public class KlasaImplementujacaStrumienie implements Strumienie{

	private List<Samochod> samochody;
	public KlasaImplementujacaStrumienie(List<Samochod> l)
	{
		samochody=l;
	}
	
	@Override
	public Samochod getNajdluzszySamochod() {
		return samochody.stream().max((s1,s2)->Integer.compare(s1.getDlogosc(),s2.getDlogosc())).orElse(null);
	}

	@Override
	public Samochod getSamochodONajmniejszejSzerokosci() {
		return samochody.stream().min((s1,s2)->Integer.compare(s1.getSzerokosc(),s2.getSzerokosc())).orElse(null);
	}

	@Override
	public Samochod getNajlzejszySamochodWloski() {
		return samochody.stream().filter(s-> s instanceof SamochodWloski).min((s1,s2)->Integer.compare(s1.getMasaWlasna(),s2.getMasaWlasna())).orElse(null);
	}

	@Override
	public List<Samochod> getCoNajwyzej3ZSamochodowMieszczacychSieWGarazu() {
		return samochody.stream().filter(s-> s.getDlogosc()<=500 && s.getSzerokosc()<=160 && s.getWysokosc()<=150).limit(3).collect(Collectors.toList());
	}

	@Override
	public List<Samochod> getSamochodyPosortowaneMalejacoWzgledemMasyPomniejszonejOSumeWymiarow() {
		return samochody.stream().sorted((s1,s2)->Integer.compare(
				s2.getMasaWlasna()-(s2.getDlogosc()+s2.getSzerokosc()+s2.getWysokosc()),
				s1.getMasaWlasna()-(s1.getDlogosc()+s1.getSzerokosc()+s1.getWysokosc()))).collect(Collectors.toList());
	}

	@Override
	public List<Samochod> getSamochodyNieLzejszeNiz1000KgINieSzerszeNiz170() {
		return samochody.stream().filter(s1-> s1.getMasaWlasna()>=1000 && s1.getSzerokosc()<=170).collect(Collectors.toList());
	}

	@Override
	public List<Samochod> getPierwszePiecZPosortowanychMalejacoSNWzglWysok() {
		return samochody.stream().filter(s-> s instanceof SamochodNiemiecki).sorted((s1,s2)->Integer.compare(s2.getWysokosc(), s1.getWysokosc())).limit(5).collect(Collectors.toList());
	}

	@Override
	public long getSumaSzerokosciSamochodowJaponskichNieCiezszychNiz1000kgBezDwochPierwszych() {
		return samochody.stream().skip(2).filter(s-> s instanceof SamochodJaponski && s.getMasaWlasna()<=1000).collect(Collectors.summingInt(s-> s.getSzerokosc()));
	}

	@Override
	public List<Samochod> getCoNajwyzej4ZPosortowanychMalejacoWzglMasyPoczawszyOd10tego() {
		return samochody.stream().skip(5).sorted((s1,s2)->Integer.compare(s2.getMasaWlasna(),s1.getMasaWlasna())).limit(4).collect(Collectors.toList());
	}

	@Override
	public Map<String, Samochod> mapujModelNaSamochodTylkoWloskie() {
		return samochody.stream().filter(s->s instanceof SamochodWloski).collect(Collectors.toMap(Samochod::getMarka, s->s,(old,newer)->newer));
	}

	@Override
	public List<Integer> getJaponskieSamochodyZamienioneNaWartosciIchMasy() {
		return samochody.stream().filter(s->s instanceof SamochodJaponski).map(Samochod::getMasaWlasna).collect(Collectors.toList());
	}

}
