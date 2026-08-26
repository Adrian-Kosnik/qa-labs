package streams;

import java.util.Arrays;
import java.util.List;

public class MoviesStream {
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(new Movie("Inception", "Sci-Fi", 8.8, 2010),
				new Movie("Interstellar", "Sci-Fi", 8.6, 2014), new Movie("The Dark Knight", "Action", 9.0, 2008),
				new Movie("Tenet", "Sci-Fi", 7.5, 2020), new Movie("The Prestige", "Drama", 8.5, 2006),
				new Movie("Memento", "Thriller", 8.4, 2000), new Movie("Dunkirk", "War", 7.9, 2017));

		// TODO: Solve the tasks here
		
		movies.stream().filter(movie -> movie.getGenre() == "Sci-Fi")
					   .sorted(movies.sort(movie.getRating())
					   
					   
					   
					   ;
	}
}

class Movie {
	String title;
	String genre;
	double rating;
	int year;

	public Movie(String title, String genre, double rating, int year) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return title + " (" + year + ") - " + rating;
	}
}
