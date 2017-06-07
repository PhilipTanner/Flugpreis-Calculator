package logic;

import dto.Destination;

public abstract class Flug {
	
	private Destination destinationFrom;
	private Destination destinationTo;
	protected int persons;
	protected boolean returnFlight;
	protected double distance;
	protected double price;
	
	public Flug(Destination destinationFrom, Destination destinationTo, int persons, boolean returnFlight){
		this.destinationFrom = destinationFrom;
		this.destinationTo = destinationTo;
		this.persons = persons;
		this.returnFlight = returnFlight;
	}
	
	public double calcDistance(){
		double x = destinationFrom.getCoordinateAltitude() - destinationTo.getCoordinateAltitude();
		double y = destinationFrom.getCoordinateLatitude() - destinationTo.getCoordinateLatitude();
		distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		return distance;
	}
	
	public abstract double calcPrice();
	
}
