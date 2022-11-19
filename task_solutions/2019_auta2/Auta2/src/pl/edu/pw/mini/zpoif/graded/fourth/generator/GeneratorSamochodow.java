package pl.edu.pw.mini.zpoif.graded.fourth.generator;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.zpoif.graded.fourth.auta.Samochod;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodInny;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodJaponski;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodNiemiecki;
import pl.edu.pw.mini.zpoif.graded.fourth.auta.SamochodWloski;
/**
 * Klasa generuje zestaw statycznych figur geometrycznych.
 */
public class GeneratorSamochodow {
	
	public static List<Samochod> generateAll(){
		List<Samochod> result = new ArrayList<>();
		
		result.add(new SamochodJaponski("Honda Civic IV (1987 r.)", (char)397, (char)167, (char)133, (char)900, true, (byte)1));
		result.add(new SamochodJaponski("Honda Civic VII (2000 r.)", (char)429, (char)172, (char)150, (char)1090, true, (byte)1));
		result.add(new SamochodJaponski("Honda Civic IX (2011 r.)", (char)430, (char)177, (char)147, (char)1185, true, (byte)1));
		result.add(new SamochodJaponski("Honda Civic IX (2011 r.)", (char)430, (char)177, (char)147, (char)1185, true, (byte)1));
		
		result.add(new SamochodInny("Citroen AX (1986 r.)", (char)349, (char)156, (char)135, (char)640, true, (byte)1));
		result.add(new SamochodInny("Citroen C3 II (2009 r.)", (char)394, (char)173, (char)152, (char)1085, true, (byte)1));
		result.add(new SamochodInny("Ford Fiesta III (1989 r.)", (char)374, (char)161, (char)133, (char)770, true, (byte)1));
		
		result.add(new SamochodNiemiecki("Mercedes W211 (2002 r.)", (char)483, (char)182, (char)145, (char)1570, true, (byte)1));
		result.add(new SamochodNiemiecki("BMW serii 3 E30 (1987 r.)", (char)433, (char)165, (char)138, (char)1100, true, (byte)1));
		result.add(new SamochodNiemiecki("BMW serii 3 E36 (1991 r.)", (char)444, (char)170, (char)140, (char)1185, true, (byte)1));
		result.add(new SamochodNiemiecki("BMW serii 3 E46 (1998 r.)", (char)447, (char)174, (char)142, (char)1285, true, (byte)1));
		result.add(new SamochodNiemiecki("Opel Corsa A (1982 r.)", (char)363, (char)153, (char)137, (char)740, true, (byte)1));
		result.add(new SamochodNiemiecki("BMW serii 3 F30 (2011 r.)", (char)462, (char)181, (char)143, (char)1400, true, (byte)1));
		
		result.add(new SamochodJaponski("Toyota Auris II (2012 r.)", (char)428, (char)176, (char)146, (char)1260, true, (byte)1));
		result.add(new SamochodNiemiecki("Audi 80 B4 (1991 r.)", (char)448, (char)170, (char)141, (char)1180, true, (byte)1));
		result.add(new SamochodWloski("Fiat Uno II (1989 r.)", (char)369, (char)156, (char)142, (char)760, true, (byte)1));
		result.add(new SamochodWloski("Fiat Uno II (1989 r.)", (char)369, (char)156, (char)142, (char)760, true, (byte)1));
		
		result.add(new SamochodNiemiecki("Audi A4 B9 (2015 r.)", (char)473, (char)184, (char)143, (char)1395, true, (byte)1));
		
		result.add(new SamochodNiemiecki("Opel Corsa E (2015 r.)", (char)402, (char)174, (char)148, (char)1060, true, (byte)1));
		result.add(new SamochodNiemiecki("Mercedes W210 (1995 r.)", (char)482, (char)180, (char)150, (char)1590, true, (byte)1));
		result.add(new SamochodNiemiecki("BMW serii 3 E90 (2004 r.)", (char)452, (char)182, (char)142, (char)1360, true, (byte)1));
		
		
		result.add(new SamochodJaponski("Toyota Corolla E90 (1987 r.)", (char)400, (char)166, (char)137, (char)915, true, (byte)1));
		result.add(new SamochodJaponski("Toyota Corolla E11 (1997 r.)", (char)412, (char)169, (char)138, (char)1050, true, (byte)1));
		
		result.add(new SamochodWloski("Fiat Punto I (1993 r.)", (char)376, (char)163, (char)145, (char)830, true, (byte)1));
		result.add(new SamochodWloski("Fiat Punto III (2012 r.)", (char)407, (char)169, (char)149, (char)1015, true, (byte)1));
		
		
		result.add(new SamochodInny("Ford Fiesta VII (2008 r.)", (char)397, (char)172, (char)148, (char)980, true, (byte)1));
		result.add(new SamochodInny("Ford Sierra (1987 r.)", (char)443, (char)170, (char)136, (char)1040, true, (byte)1));
		result.add(new SamochodInny("Jeep Grand Cherokee ZJ (1993 r.)", (char)449, (char)176, (char)165, (char)1625, true, (byte)1));
		
		return result;
	}
	
}
