// Yunning ZHOU, MACS. A Seat class for a specified screening instance.
package cinemaManagement;

public class Seat {
	private int row;
	private int column;
	private boolean occupancy;
	public Seat(int row, int column) {
		this.row = row;
		this.column = column;
		occupancy = false;
	}
	
	public void buyTicket() {
		occupancy = true;
	}
	
	public void cancleTicket() {
		occupancy = false;
	}
	
	public boolean isOccupied() {
		return occupancy;
	}

	public String toString() {
		if (occupancy == true) {
			return "Occupied";
		}
		else {
			return "Available";
		}
	}


}
