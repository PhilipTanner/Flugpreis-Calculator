package logic;

import dto.Destination;

public class Business extends Flug {

	public Business(Destination destinationFrom, Destination destinationTo, int persons, boolean returnFlight) {
		super(destinationFrom, destinationTo, persons, returnFlight);

	}

	@Override
	public double calcPrice() {
		price = distance * 120;
		if(returnFlight == true){
			price = price * 2;
		}
		price = price * persons; 
		return price;
	}

}
