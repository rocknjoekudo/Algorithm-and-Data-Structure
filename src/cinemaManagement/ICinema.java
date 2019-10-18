// Yunning ZHOU, MACS. Interface of Cinema class. Provided by Algo Data course.
// Modified for accurate match screening with three parameters instead of two.
package cinemaManagement;
public interface ICinema {
	/*
	 * Add movie with given title and length to the list of movies screened in the
	 * cinema
	 *
	 * @param title //title of the movie
	 * 
	 * @param length //length of movie in hours, e.g. 1, 2, 3 ...
	 */
	public void addMovie(String title, int length);

	/*
	 * Add room with given room number and number of seats to the cinema
	 *
	 * @param number //room number
	 * 
	 * @param rows //number of rows in the room
	 * 
	 * @param seats //number of seats in a row
	 */
	public void addRoom(int number, int rows, int seatsPerRow);

	/*
	 * Add movie screening to the cinema
	 *
	 * @param movieTitle //title of the movie
	 * 
	 * @param screeningTime //time of the screening
	 * 
	 * @param roomNumber //number of the room in which movie is screened
	 */
	public void addScreening(String movieTitle, int screeningTime, int roomNumber);

	/*
	 * Buy ticket to a movie screening
	 *
	 * @param movieTitle //title of the movie
	 * 
	 * @param screeningTime //time of the screening
	 * 
	 * @return The ticketId or -1 in case the ticket cannot be bought
	 */
	public int buyTicket(String movieTitle, int screeningTime, int room);

	/*
	 * Buy ticket to a movie screening
	 *
	 * @param movieTitle //title of the movie
	 * 
	 * @param room //the room number
	 * 
	 * @param screeningTime //time of the screening
	 * 
	 * @param row //the row number
	 * 
	 * @param seat //the seat number (in the row)
	 * 
	 * @return The ticketId or -1 in case the ticket cannot be bought
	 */
	public int buyTicket(String movieTitle, int screeningTime, int room, int row, int column);

	/*
	 * Cancel ticket to a movie screening
	 *
	 * @param ticketId //id of the ticket to be canceled
	 */
	public void cancelTicket(int ticketId);

	/*
	 * Get popcorn with a ticket. Method prints whether you get a free popcorn or
	 * not.
	 *
	 * @param ticketId //id of the ticket for popcorn
	 */
	public void getFreePopcorn(int ticketId);

	/*
	 * Add customer to the waiting list of a movie screening
	 *
	 * @param movieTitle //title of the movie
	 * 
	 * @param screeningTime //time of the screening
	 * 
	 * @param customerName //name of customer
	 */
	public void getOnWaitingList(String movieTitle, int screeningTime, int room, String customerName);

	/*
	 * Print all screenings for marathon ticket
	 */
	public void getScreeningsForMarathonTicket();

	/*
	 * Get number of sold tickets
	 *
	 * @return number of sold tickets
	 */
	public int getSoldTicketCount();

	/*
	 * Print all screenings in the cinema
	 */
	public void printAllScreenings();

	/*
	 * Print waiting list of the screenings
	 *
	 * @param movieTitle //title of the movie
	 * 
	 * @param screeningTime //time of the movie screening
	 */
	public void printWaitingList(String movieTitle, int screeningTime, int room);

	/*
	 * Print Buy ticket to a movie screening
	 *
	 * @param movieTitle //title of the movie
	 * 
	 * @param room //the room number
	 * 
	 * @param screeningTime //time of the screening
	 */
	public void printScreening(String movieTitle, int room, int screeningTime);
}