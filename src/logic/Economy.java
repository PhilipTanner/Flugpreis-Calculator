package logic;

import dto.Destination;

public class Economy extends Flug {

	public Economy(Destination destinationFrom, Destination destinationTo, int persons, boolean returnFlight) {
		super(destinationFrom, destinationTo, persons, returnFlight);

	}

	@Override
	public double calcPrice() {
		price = distance * 0.08;
		if (returnFlight == true) {
			price = price * 2;
		}
		price = price * persons;
		return price;
	}

}
