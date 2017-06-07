package dto;

public class Destination {
	
	private String name;
	private double coordinateAltitude;
	private double coordinateLatitude;
	
	public Destination(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoordinateAltitude() {
		return coordinateAltitude;
	}

	public void setCoordinateAltitude(double coordinateAltitude) {
		this.coordinateAltitude = coordinateAltitude;
	}

	public double getCoordinateLatitude() {
		return coordinateLatitude;
	}

	public void setCoordinateLatitude(double coordinateLatitude) {
		this.coordinateLatitude = coordinateLatitude;
	}
	

}
