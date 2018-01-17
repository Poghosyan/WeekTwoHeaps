import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MovieRatingsParser {

	/**
	 * Takes a List of UserMovieRatings as input and creates a TreeMap data structure from it. The TreeMap is a mapping
     * from the movie’s title to a PriorityQueue of all its associated ratings.
     *
     * Keep in mind that the same movie title may appear numerous times in the input List, and multiple instances may
     * even have the same rating.
     *
     * A distinct movie title should only appear once as a key in the TreeMap, however, and be mapped to a PriorityQueue
     * (min-heap) of all the ratings for that movie.
     *
	 * @param allUsersRatings
	 * @return
	 */
	public static TreeMap<String, PriorityQueue<Integer>> parseMovieRatings(List<UserMovieRating> allUsersRatings) {
		TreeMap<String, PriorityQueue<Integer>> result = new TreeMap<String, PriorityQueue<Integer>>();

		if (allUsersRatings == null || allUsersRatings.isEmpty()) {
			return result;
		}

		for (UserMovieRating rating : allUsersRatings) {
			if (rating != null) {
			    if (rating.getMovie() == null || "".equals(rating.getMovie()) || rating.getUserRating() < 0) {
			        continue;
                }

                String movie = rating.getMovie();
			    movie = movie.toLowerCase();
			    PriorityQueue<Integer> currentRatings = result.get(movie);

			    if (currentRatings == null) {
			        currentRatings = new PriorityQueue<Integer>();
                }

                currentRatings.add(rating.getUserRating());
			    result.put(movie, currentRatings);
            }
		}
		
		return result;
	}

}
