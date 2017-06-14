package data;

import java.util.ArrayList;

import dto.Destination;

public class FlugData {
	
	public static void main(String[]args){
	
	Destination london = new Destination("London",51.50853, -0.12574);
	Destination tokyo = new Destination("Tokyo",35.6895, 139.69171);
	Destination newyork = new Destination("New York",40.4251,-74.0021);
	Destination dubai = new Destination("Dubai",25.0657, 55.17128);
	Destination johannesburg = new Destination("Johannesburg",-26.20227, 28.04363);
	ArrayList<Destination> destination = new ArrayList<Destination>();
	destination.add(london);
	destination.add(tokyo);
	destination.add(newyork);
	destination.add(dubai);
	destination.add(johannesburg);
	
	
	}
}
