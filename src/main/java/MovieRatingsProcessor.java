/*
 * SD2x Homework #5
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */

import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;


public class MovieRatingsProcessor {

    /**
     * return a List of movie titles in alphabetical order
     *
     * If the input is null or an empty TreeMap, the data structure returned by the method should be empty
     * You can assume that all movie titles in the input TreeMap consist of lowercase letters.
     *
     * @param movieRatings
     * @return
     */
	public static List<String> getAlphabeticalMovies(TreeMap<String, PriorityQueue<Integer>> movieRatings) {
		
		/* IMPLEMENT THIS METHOD! */
		
		return null; // this line is here only so this code will compile if you don't modify it
	}

    /**
     * given an input int rating, return a List of movie titles in alphabetical order, where all movies in the List do
     * not have any ratings less than or equal to rating (hint: the PriorityQueue is a min-heap, meaning that the
     * smallest rating is at the front of the queue!)
     *
     * If the input is null or an empty TreeMap, the data structure returned by the method should be empty
     * You can assume that all movie titles in the input TreeMap consist of lowercase letters.
     *
     * @param movieRatings
     * @param rating
     * @return
     */
	public static List<String> getAlphabeticalMoviesAboveRating(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
		
		/* IMPLEMENT THIS METHOD! */
		
		return null; // this line is here only so this code will compile if you don't modify it
	}

    /**
     * given an input int rating, modify the TreeMap object that was passed as an argument so that you remove all
     * ratings in the PriorityQueue that are below (but not equal to) rating for every movie in the Map. If all ratings
     * are removed from a movie’s PriorityQueue, then remove the mapping from the TreeMap. Additionally, this method
     * should return a new TreeMap that maps a movie title to the number of ratings that were removed from its
     * corresponding PriorityQueue; the TreeMap that is returned should only contain movies that had ratings removed
     * from its PriorityQueue.
     *
     * If the input is null or an empty TreeMap, the data structure returned by the method should be empty
     * You can assume that all movie titles in the input TreeMap consist of lowercase letters.
     *
     * @param movieRatings
     * @param rating
     * @return
     */
	public static TreeMap<String, Integer> removeAllRatingsBelow(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
		
		/* IMPLEMENT THIS METHOD! */
		
		return null; // this line is here only so this code will compile if you don't modify it
	}
}
