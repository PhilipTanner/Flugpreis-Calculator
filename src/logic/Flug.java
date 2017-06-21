package logic;

import dto.Destination;

public abstract class Flug {

	private Destination destinationFrom;
	private Destination destinationTo;
	protected int persons;
	protected boolean returnFlight;
	protected double distance;
	protected double price;

	public Flug(Destination destinationFrom, Destination destinationTo, int persons, boolean returnFlight) {
		this.destinationFrom = destinationFrom;
		this.destinationTo = destinationTo;
		this.persons = persons;
		this.returnFlight = returnFlight;
		this.distance = this.calcDistance();
	}

	private double calcDistance() {
		double lat1 = destinationFrom.getLatitude();
		double lat2 = destinationTo.getLatitude();
		double lon1 = destinationFrom.getLongitude();
		double lon2 = destinationTo.getLongitude();
		double theta = lon1 - lon2;
		double distance = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2))
				+ Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		distance = Math.acos(distance);
		distance = rad2deg(distance);
		distance = distance * 60 * 1.1515;
		distance = distance * 1.609344;

		return distance;
	}

	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}

	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	public abstract double calcPrice();

}
