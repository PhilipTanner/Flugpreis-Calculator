package logic;

import java.util.ArrayList;

import data.FlugDAO;
import data.FlugData;
import dto.Destination;

public class DataBridge {
	
	private ArrayList<Destination> destination;
	public FlugDAO dao = new FlugData();

	public DataBridge() {
		this.destination = dao.getDestinations();
	}
	
	public ArrayList<Destination> getDestinations(){
		return this.destination;
	}
	

}
