/*
 * SD2x Homework #5
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

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
     * Your implementation of parseMovieRatings should also adhere to the following:
     *
     * [X] If the input List is null or empty, parseMovieRatings should return an empty TreeMap
	 *
     * [X] If the input List contains any null UserMovieRatings object, or a UserMovieRatings object whose movie title is
     * null or an empty string, or a UserMovieRatings object whose rating is negative, parseMovieRatings should ignore
     * that UserMovieRatings object
     *
     * The movie titles should be considered case-insensitive, i.e. if two UserMovieRatings objects have the same title
     * that differ only in case (upper or lower), they should be considered the same movie. The movie titles stored in
     * the TreeMap must use lowercase letters.
     *
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
