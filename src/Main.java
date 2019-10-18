// Yunning ZHOU, MACS. A Main class for running Cinema Management instances.
// Missing method: getScreeningsForMarathonTicket(). Reason: Yunning ZHOU could not figure out a solution to find the longest path of a graph with a generic algorithm.
import cinemaManagement.Cinema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cinema cinema1 = new Cinema("UGC");
		// System.out.println(cinema1);
		cinema1.addMovie("Matrix 1", 2);
		cinema1.addMovie("Matrix 2", 3);
		cinema1.addRoom(1, 1, 3);
		cinema1.addScreening("Matrix 1", 11, 1);
		cinema1.addScreening("Matrix 2", 15, 1);
		System.out.println(cinema1.buyTicket("Matrix 1", 11, 1));
		System.out.println(cinema1.buyTicket("Matrix 1", 11, 1));
		System.out.println(cinema1.buyTicket("Matrix 1", 11, 1));
		System.out.println(cinema1.buyTicket("Matrix 1", 11, 1));
		cinema1.getOnWaitingList("Matrix 1", 11, 1, "Neo");
		cinema1.getOnWaitingList("Matrix 1", 11, 1, "Smith");
		System.out.println(cinema1.getSoldTicketCount());
		cinema1.printAllScreenings();
		cinema1.printWaitingList("Matrix 1", 11, 1);
		cinema1.cancelTicket(2);
		System.out.println(cinema1.getSoldTicketCount());
		cinema1.printWaitingList("Matrix 1", 11, 1);
		cinema1.addScreening("Matrix 1", 15, 1);
		System.out.println(cinema1.buyTicket("Matrix 1", 15, 1));
		System.out.println(cinema1.buyTicket("Matrix 1", 11, 1, 1, 1));
		System.out.println(cinema1.buyTicket("Matrix 1", 11, 1, 1, 3));
		System.out.println(cinema1.getSoldTicketCount());
		cinema1.printAllScreenings();
		cinema1.getFreePopcorn(1);
		cinema1.getFreePopcorn(2);
		cinema1.getFreePopcorn(1);
		cinema1.getFreePopcorn(10);
		cinema1.printScreening("Matrix 1", 1, 11);

	}

}
