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
     * If the input List is null or empty, parseMovieRatings should return an empty TreeMap
     * If the input List contains any null UserMovieRatings object, or a UserMovieRatings object whose movie title is
     * null or an empty string, or a UserMovieRatings object whose rating is negative, parseMovieRatings should ignore
     * that UserMovieRatings object
     * The movie titles should be considered case-insensitive, i.e. if two UserMovieRatings objects have the same title
     * that differ only in case (upper or lower), they should be considered the same movie. The movie titles stored in
     * the TreeMap must use lowercase letters.
     *
     * Please do not change the signature of the parseMovieRatings method and please do not modify UserMovieRatings.java.
     * Also, please do not create any additional .java files for your solution. If you need additional classes, you can
     * define them in MovieRatingsParser.java. Last, please be sure that your MovieRatingsParser class is in the default
     * package, i.e. there is no “package” declaration at the top of the source code.
     *
	 * @param allUsersRatings
	 * @return
	 */
	public static TreeMap<String, PriorityQueue<Integer>> parseMovieRatings(List<UserMovieRating> allUsersRatings) {
		
		/* IMPLEMENT THIS METHOD! */
		
		return null; // this line is here only so this code will compile if you don't modify it
	}

}
