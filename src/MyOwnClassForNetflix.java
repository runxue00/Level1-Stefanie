import javax.swing.JOptionPane;

public class MyOwnClassForNetflix {
public static void main(String[] args) {
	Movie m1 = new Movie("Cats", 3);
	Movie m2 = new Movie("The Adventures of Milo and Otis", 4);
	Movie m3 = new Movie("Puss in Boots", 2);
	Movie m4 = new Movie("Garfield", 4);
	Movie m5 = new Movie("Top Cats", 3);
	Movie m6 = new Movie("The Cat in the Hat", 0);
	Movie m7 = new Movie("Felix the Cat", 5);
	NetflixQueue n = new NetflixQueue();
	
	JOptionPane.showMessageDialog(null, m7.getTicketPrice());
	n.addMovie(m1);
	n.addMovie(m2);
	n.addMovie(m3);
	n.addMovie(m4);
	n.addMovie(m5);
	n.addMovie(m6);
	n.addMovie(m7);
	
	n.printMovies();
	JOptionPane.showMessageDialog(null, "the best movie is " + n.getBestMovie());
	JOptionPane.showMessageDialog(null, "the second best movie is " + n.getMovie(1));
}
}
