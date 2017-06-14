package dto;

public class Destination {
	
	private String name;
	private double latitude;
	private double longitude;
	
	public Destination(String name, double latitude, double longitude){
		
	}

	@Override
	public String toString() {
		return name;
	}

	public Destination(String name, double latitude, double longitude) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


}
