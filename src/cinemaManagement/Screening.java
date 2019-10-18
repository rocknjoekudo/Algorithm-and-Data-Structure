// Yunning ZHOU, MACS. A Movie Screening class.
package cinemaManagement;

import dataStructure.Queue;
import dataStructure.MatrixNonSquare;

public class Screening implements Comparable{
	private int screeningTime;
	private Movie movie;
	private Room room;
	private int ticketNumbers;
	private int ticketSold;
	private MatrixNonSquare seatMap;
	private Queue waitingList;

	public Screening(int screeningTime, Movie movie, Room room) {
		this.screeningTime = screeningTime;
		this.movie = movie;
		this.room = room;
		this.ticketNumbers = room.getNumberOfSeat();
		this.ticketSold = 0;
		this.waitingList = new Queue();
		this.seatMap = new MatrixNonSquare(room.getRows(), room.getSeatsPerRow());
		for (int i = 0; i < seatMap.getRow(); i++) {
			for (int j = 0; j < seatMap.getColumn(); j++) {
				seatMap.set(i, j, new Seat(i + 1, j + 1));
			}
		}
	}

	public int getScreeningTime() {
		return screeningTime;
	}

	public Movie getMovie() {
		return movie;
	}

	public Room getRoom() {
		return room;
	}

	public void setScreeningTime(int screeningTime) {
		this.screeningTime = screeningTime;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public boolean isTicketAvailable() {
		if (ticketSold < ticketNumbers) {
			return true;
		} else {
			return false;
		}
	}

	public Seat findAvailableSeat() {
		Seat seat = null;
		if (this.isTicketAvailable()) {
			int row = room.getRows();
			int column = room.getSeatsPerRow();
			for (int i = 0; i <= row - 1; i++) {
				for (int j = 0; j <= column - 1; j++) {
					Seat seatCandidate = (Seat) seatMap.get(i, j);
					if (!seatCandidate.isOccupied()) {
						seat = seatCandidate;
						break;
					}
				}
			}
		}
		return seat;

	}
	
	public Seat findSeat(int row, int column) {
		return (Seat) seatMap.get(row - 1, column - 1);
	}

	public void addTicketCount() {
		ticketSold++;
	}

	public void reduceTicketCount() {
		ticketSold--;
	}

	public void getOnWaitingList(String customerName) {
		if (!this.isTicketAvailable()) {
			this.waitingList.push(customerName);
		}
	}

	public void reduceWaitingList() {
		if (!waitingList.empty()) {
			System.out.println(this.waitingList.pop() + ", Please come to buy the ticket.");
		}
		
	}

	public String getWaitingList() {
		return waitingList.toString();
	}
	
	public void buyTicket(Seat seat) {
		this.addTicketCount();
		seat.buyTicket();
	}
	
	public void cancelTicket(Seat seat) {
		this.reduceTicketCount();
		this.reduceWaitingList();
		seat.cancleTicket();

	}

	public String toString() {
		String s = "Screening Time: " + screeningTime + ", Movie: " + movie.toString() + ", " + room.toString()
				+ ", Number of Sold Tickets: " + ticketSold;
		return s;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Screening screening = (Screening) arg0;
		if (screeningTime == screening.getScreeningTime()
				&& movie.compareTo(screening.getMovie()) == 0
				&& room.compareTo(screening.getRoom()) == 0) {
			return 0;
		}
		else if (screeningTime <screening.getScreeningTime()) {
			return -1;
		}
		else {
			return 1;
		}
	}

}
