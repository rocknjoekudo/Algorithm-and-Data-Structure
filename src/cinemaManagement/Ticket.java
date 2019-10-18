// Yunning ZHOU, MACS. A Ticket class.
package cinemaManagement;

public class Ticket {
	private int ticketId;
	private Screening screening;
	private boolean freePopcorn;
	private Seat seat;

	// New ticket without specified seat number
	public Ticket(int ticketId, Screening screening, Seat seat) {
		this.ticketId = ticketId;
		this.screening = screening;
		this.freePopcorn = true;
		this.seat = seat;
	}

	// New ticket with specified seat number.
	public Ticket(int ticketId, Screening screening, int row, int column) {
		this.ticketId = ticketId;
		this.screening = screening;
		this.freePopcorn = true;
		seat = screening.findSeat(row, column);
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Screening getScreening() {
		return screening;
	}

	public void setScreening(Screening screening) {
		this.screening = screening;
	}

	public Seat getSeat() {
		return seat;
	}

	public boolean isFreePopcornAvailable() {
		if (freePopcorn) {
			this.freePopcorn = false;
			return true;
		} else
			return false;
	}

	public String toString() {
		String s = "TicketId: " + ticketId;
		return s;
	}

}
