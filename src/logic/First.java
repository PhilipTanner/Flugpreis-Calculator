package logic;

import dto.Destination;

public class First extends Flug {

	public First(Destination destinationFrom, Destination destinationTo, int persons, boolean returnFlight) {
		super(destinationFrom, destinationTo, persons, returnFlight);

	}

	@Override
	public double calcPrice() {
		price = distance * 0.25;
		if (returnFlight == true) {
			price = price * 2;
		}
		price = price * persons;
		return price;
	}

}
