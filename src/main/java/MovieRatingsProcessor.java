/*
 * SD2x Homework #5
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */

import sun.reflect.generics.tree.Tree;

import java.util.*;


public class MovieRatingsProcessor {

    /**
     * return a List of movie titles in alphabetical order
     *
     * @param movieRatings
     * @return
     */
    public static List<String> getAlphabeticalMovies(TreeMap<String, PriorityQueue<Integer>> movieRatings) {
        if (movieRatings == null || movieRatings.isEmpty()) {
            return new ArrayList<String>();
        }

        return new ArrayList<String>(movieRatings.navigableKeySet());
    }

    /**
     * given an input int rating, return a List of movie titles in alphabetical order, where all movies in the List do
     * not have any ratings less than or equal to rating (hint: the PriorityQueue is a min-heap, meaning that the
     * smallest rating is at the front of the queue!)
     *
     * @param movieRatings
     * @param rating
     * @return
     */
    public static List<String> getAlphabeticalMoviesAboveRating(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
        if (movieRatings == null || movieRatings.isEmpty()) {
            return new ArrayList<String>();
        }

        ArrayList<String> result = new ArrayList<String>();

        for (Map.Entry<String, PriorityQueue<Integer>> entry : movieRatings.entrySet()) {
            PriorityQueue<Integer> ratings = entry.getValue();

            //TODO: What needs to happen when no ratings are in the PriorityQueue?
            if (rating >= ratings.peek()) {
                continue;
            }

            //TODO: could possibly use Binary Search Tree to get alphabetical order for practice
            //Insert and remove are both Log(n) so complexity would be 2 * n * log(n)
            result.add(entry.getKey());
        }

        Collections.sort(result);
        return result;
    }

    /**
     * given an input int rating, modify the TreeMap object that was passed as an argument so that you remove all
     * ratings in the PriorityQueue that are below rating for every movie in the Map.
     * <p>
     * If all rating are removed from a movie’s PriorityQueue, then remove the mapping from the TreeMap.
     * <p>
     * Additionally, this method should return a new TreeMap that maps a movie title to the number of ratings that were
     * removed from its corresponding PriorityQueue; the TreeMap that is returned should only contain movies that had
     * ratings removed from its PriorityQueue.
     *
     * @param movieRatings
     * @param rating
     * @return
     */
    public static TreeMap<String, Integer> removeAllRatingsBelow(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
        //TODO: Could this be optimized somehow? What's another method for modifying moveRatings
        if (movieRatings == null || movieRatings.isEmpty()) {
            return new TreeMap<String, Integer>();
        }

        TreeMap<String, PriorityQueue<Integer>> tempRatings = new TreeMap<String, PriorityQueue<Integer>>(movieRatings);
        TreeMap<String, Integer> result = new TreeMap<String, Integer>();

        for (Map.Entry<String, PriorityQueue<Integer>> entry : tempRatings.entrySet()) {
            PriorityQueue<Integer> ratings = entry.getValue();
            Integer counter = 0;

            while (!ratings.isEmpty() && ratings.peek() < rating) {
                ratings.remove();
                counter++;
            }

            if (counter > 0) {
                result.put(entry.getKey(), counter);
                movieRatings.put(entry.getKey(), ratings);
            }

            if (ratings.isEmpty()) {
                movieRatings.remove(entry.getKey());
            }
        }

        return result;
    }
}
