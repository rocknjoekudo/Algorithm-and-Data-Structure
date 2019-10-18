// Yunning ZHOU, MACS. A Room class.
package cinemaManagement;
import dataStructure.MatrixNonSquare;

public class Room implements Comparable{
	private int roomNumber;
	private int rows;
	private int seatsPerRow;

	public Room(int roomNumber, int rows, int seatsPerRow) {
		this.roomNumber = roomNumber;
		this.rows = rows;
		this.seatsPerRow = seatsPerRow;
		
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public int getNumberOfSeat() {
		return rows * seatsPerRow;
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getSeatsPerRow() {
		return seatsPerRow;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String toString() {
		String s = "Room number: " + roomNumber + ", Number of seats: " + this.getNumberOfSeat();
		return s;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Room room = (Room) arg0;
		if (roomNumber < room.getRoomNumber()) {
			return -1;
		}
		else if(roomNumber == room.getRoomNumber()) {
			return 0;
		}
		else {
			return 1;
		}
		
	}
}
