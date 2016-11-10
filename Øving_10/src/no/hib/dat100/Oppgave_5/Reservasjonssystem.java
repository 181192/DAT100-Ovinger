package no.hib.dat100.Oppgave_5;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Reservasjonssystem {	

	HashMap<Integer, Person> register = new HashMap<Integer, Person>();

	ArrayList<Reservasjon> resList = new ArrayList<Reservasjon>();

	ArrayList<Rom> rom = new ArrayList<Rom>();
	
	public static Date settTid(int i) {
		Date tid = new Date();
		tid.setTime(i);
		
		return tid;
	}

	public void opprettMidlertidig(int romnr, Date start, Date slutt, int resnr, Person p) {
		Reservasjon reservasjon = new MidlertidigReservasjon(romnr, start, slutt, resnr, p);
		resList.add(reservasjon);
		register.put(romnr, p);
	}

	public void opprettPermanent(int romnr, Date start, Date slutt, int resnr, BordogStoler info, Person p) {
		Reservasjon reservasjon = new PermanentReservasjon(romnr, start, slutt, resnr, info, p);
		resList.add(reservasjon);
		register.put(romnr, p);
	}
	
	public void slettReservasjon(MidlertidigReservasjon m) {
		resList.remove(m);
		register.remove(m.getRomnummer());
	}
	
	public void skjekkTid(MidlertidigReservasjon m) {	
		Date tid = new Date();
		tid.setHours(0);
		
		for (Reservasjon r : resList) {
			if (r.getSluttTid() == tid) {
				slettReservasjon(m);
			}
		}
	}

	public void endreReservasjon(MidlertidigReservasjon m) {
		
	}
	
	public Reservasjon finnReservasjon(Person p) {
		Reservasjon res = null;
		Integer nokkel = null;
		for (Integer i : register.keySet()) {
			if (register.containsValue(p)) {
				nokkel = i;
			}
		}
		for (Reservasjon r : resList) {
			if (r.getRomnummer() == nokkel) {
				res = r;
			}
		}
		return res;
	}

	public void visReservasjon(Rom r) {
		register.get(r);
	}

} // klasse
