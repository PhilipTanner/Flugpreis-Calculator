package data;

import java.util.ArrayList;

import dto.Destination;

public class FlugData implements FlugDAO{
	
	
	ArrayList<Destination> destination = new ArrayList<Destination>();	
	
	
	Destination tokyo = new Destination("Tokyo, Japan", 35.689487, 139.691706);
	Destination berlin = new Destination("Berlin, Deutschland", 52.520007, 13.404954);
	Destination wien = new Destination("Wien, Österreich",48.208174, 16.373819);
	Destination kopenhagen = new Destination("Kopenhagen, Dänemark",55.676097, 12.568337);
	Destination muenchen = new Destination("München, Deutschland ",48.135125, 11.581981);
	Destination melbourne = new Destination("Melbourne, Australien",-37.813628, 144.963058);
	Destination sydney = new Destination("Sydney, Australien",-33.868820, 151.209296);
	Destination stockholm = new Destination("Stockholm, Schweden",59.329323, 18.068581);
	Destination vancouver = new Destination("Vancouver, Kanada",49.282729, -123.120738);
	Destination helsinki = new Destination("Helsinki, Finnland",60.169856, 24.938379);
	Destination zuerich = new Destination("Zürich, Schweiz",47.376887, 8.541694);
	Destination madrid = new Destination("Madrid, Spanien",40.416775, -3.703790);
	Destination hamburg = new Destination("Hamburg, Deutschland",53.551085, 9.993682);
	Destination lissabon = new Destination("Lissabon, Portugal",38.722252, -9.139337);
	Destination duesseldorf = new Destination("Düsseldorf, Deutschland",51.227741, 6.773456);
	Destination hongkong = new Destination("Hongkong, Chin",22.396428, 114.109497);
	Destination barcelona = new Destination("Barcelona, Spanien",41.385064, 2.173403);
	Destination singapur = new Destination("Singapur,", 1.352083, 103.819836);
	Destination amsterdam = new Destination("Amsterdam, Niederlande",52.370216, 4.895168);
	Destination auckland = new Destination("Auckland, Neuseeland",-36.848460, 174.763332);
	Destination honolulu = new Destination("Honolulu, Hawaii",-21.306944, -157.858333);
	Destination portland = new Destination("Portland, USA",45.523062, -122.676482);
	Destination montreal = new Destination("Montréal, Kanada",45.501689, -73.567256);
	Destination basel = new Destination("Basel, Schweiz",47.559599, 7.588576);
	
	public FlugData(){
	
		destination.add(tokyo);
		destination.add(berlin);
		destination.add(wien);
		destination.add(kopenhagen);
		destination.add(muenchen);
		destination.add(melbourne);
		destination.add(sydney);
		destination.add(stockholm);
		destination.add(vancouver);
		destination.add(helsinki);
		destination.add(zuerich);
		destination.add(madrid);
		destination.add(hamburg);
		destination.add(lissabon);
		destination.add(duesseldorf);
		destination.add(hongkong);
		destination.add(barcelona);
		destination.add(singapur);
		destination.add(amsterdam);
		destination.add(auckland);
		destination.add(honolulu);
		destination.add(portland);
		destination.add(montreal);
		destination.add(basel);
		
	}

	@Override
	public ArrayList<Destination> getDestinations() {
		return destination;
	}
}
