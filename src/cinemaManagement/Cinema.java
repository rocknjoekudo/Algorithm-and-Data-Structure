// Yunning ZHOU. A Cinema Class with Interface ICinema.
// getScreeningsForMarathonTicket() not implemented. Yunning ZHOU could not figure out a solution to find the longest path of a graph with a generic algorithm.
package cinemaManagement;

import dataStructure.DictionaryTree;
import dataStructure.Graph;
import dataStructure.Vector;
import dataStructure.Dictionary;

public class Cinema implements ICinema {

	private DictionaryTree movies;
	private DictionaryTree rooms;
	private Graph screenings;
	private Dictionary tickets;
	private String cinemaName;
	private int ticketIdCount;

	public Cinema(String cinemaName) {
		movies = new DictionaryTree();
		rooms = new DictionaryTree();
		screenings = new Graph();
		tickets = new Dictionary();
		this.cinemaName = cinemaName;
		ticketIdCount = 0;
	}

	@Override
	public void addMovie(String title, int length) {
		// TODO Auto-generated method stub
		movies.add(title, new Movie(title, length));
	}

	@Override
	public void addScreening(String movieTitle, int screeningTime, int roomNumber) {
		// TODO Auto-generated method stub
		Movie movie = this.getMovie(movieTitle);
		int length = movie.getLength();
		Room room = this.getRoom(roomNumber);
		Screening screening = new Screening(screeningTime, movie, room);
		screenings.addNode(screening);
		Vector tempScreenings = this.getAllScreening();
		// Adding edges to the graph for finding the longest paths.
		for (int i = 0; i < tempScreenings.size(); i++) {
			Screening screening2 = (Screening) tempScreenings.get(i);
			int length2 = screening2.getMovie().getLength();
			int screeningTime2 = screening2.getScreeningTime();
			if (movie.compareTo(screening2.getMovie()) != 0) {
				if (screeningTime + length <= screeningTime2) {
					screenings.addEdge(screening, screening2, length);
				}
				else if (screeningTime2 + length2 <= screeningTime) {
					screenings.addEdge(screening2, screening, length2);
				}
			}
		}
	}
	
	private Vector getAllScreening() {
		return screenings.getAllNodes();
	}

	@Override
	public int buyTicket(String movieTitle, int screeningTime, int roomNumber) {
		// TODO Auto-generated method stub
		int r = -1;
		Screening screening = this.getScreening(movieTitle, screeningTime, roomNumber);
		if (screening.isTicketAvailable()) {
			Seat seat = screening.findAvailableSeat();
			ticketIdCount++;
			tickets.add(ticketIdCount, new Ticket(ticketIdCount, screening, seat));
			screening.buyTicket(seat);
			r = ticketIdCount;
		}
		return r;
	}

	@Override
	public int buyTicket(String movieTitle, int screeningTime, int roomNumber, int row, int column) {
		// TODO Auto-generated method stub
		int r = -1;
		Screening screening = this.getScreening(movieTitle, screeningTime, roomNumber);
		if (screening.isTicketAvailable()) {
			Seat seat = screening.findSeat(row, column);
			if (!seat.isOccupied()) {
				ticketIdCount++;
				tickets.add(ticketIdCount, new Ticket(ticketIdCount, screening, seat));
				screening.buyTicket(seat);
				r = ticketIdCount;
			}
		}
		return r;
	}

	@Override
	public void cancelTicket(int ticketId) {
		// TODO Auto-generated method stub
		Ticket ticket = this.getAndRemoveTicket(ticketId);
		Screening screening = ticket.getScreening();
		Seat seat = ticket.getSeat();
		screening.cancelTicket(seat);

	}

	@Override
	public void getOnWaitingList(String movieTitle, int screeningTime, int roomNumber, String customerName) {
		// TODO Auto-generated method stub
		Screening screening = this.getScreening(movieTitle, screeningTime, roomNumber);
		if (!screening.isTicketAvailable()) {
			screening.getOnWaitingList(customerName);
		}

	}

	@Override
	public int getSoldTicketCount() {
		// TODO Auto-generated method stub
		return tickets.size();
	}

	@Override
	public void printAllScreenings() {
		// TODO Auto-generated method stub
		// System.out.print("Screenings: ");
		System.out.println(screenings);

	}

	@Override
	public void printWaitingList(String movieTitle, int screeningTime, int roomNumber) {
		// TODO Auto-generated method stub
		Screening screening = this.getScreening(movieTitle, screeningTime, roomNumber);
		System.out.print("Waiting List: ");
		System.out.println(screening.getWaitingList());

	}

	private Movie getMovie(String title) {
		return (Movie) movies.findKey(title);

	}

	private Room getRoom(int roomNumber) {
		return (Room) rooms.findKey(roomNumber);
	}

	private Screening getScreening(String movieTitle, int screeningTime, int roomNumber) {
		Movie movie = (Movie) movies.findKey(movieTitle);
		Room room = (Room) rooms.findKey(roomNumber);
		return (Screening) screenings.findNode(new Screening(screeningTime, movie, room)).getLabel();
	}

	private Ticket getTicket(int ticketId) {
		return (Ticket) tickets.find(ticketId);
	}

	private Ticket getAndRemoveTicket(int ticketId) {
		Ticket ticket = (Ticket) tickets.find(ticketId);
		if (ticket != null) {
			tickets.remove(ticketId);
		}
		return ticket;
	}

	public String toString() {
		return cinemaName;
	}

	@Override
	public void getFreePopcorn(int ticketId) {
		// TODO Auto-generated method stub
		Ticket ticket = this.getTicket(ticketId);
		if (ticket == null) {
			System.out.println("This ticket is not valid. No free popcorn.");
		} else {
			if (ticket.isFreePopcornAvailable()) {
				System.out.println("TicketId (" + ticketId + ") can get free popcorn now.");
			} else {
				System.out.println("TicketId (" + ticketId + ") has already got its free popcorn.");
			}
		}
	}

	@Override
	public void addRoom(int number, int rows, int seatsPerRow) {
		// TODO Auto-generated method stub
		rooms.add(number, new Room(number, rows, seatsPerRow));
	}

	@Override
	public void getScreeningsForMarathonTicket() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScreening(String movieTitle, int room, int screeningTime) {
		// TODO Auto-generated method stub
		Screening screening = this.getScreening(movieTitle, screeningTime, room);
		System.out.println(screening);
	}

}
