package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }
    private static final int ELEMS = 1_000_000;
    private static final int ELEMS_TO_READ = 1_000;
    private static final int TO_MS = 1_000_000;
    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */

    	ArrayList<Integer> numbers = new ArrayList<>();
    	for(int i = 1000; i < 2000; i++) {
    		numbers.add(i);
    	}
    	
    	LinkedList<Integer> numbersLinked = new LinkedList<>(numbers);
    	
    	int tmp = numbers.get(numbers.size() - 1);
    	numbers.set(numbers.size() - 1, numbers.get(0));
    	numbers.set(0, tmp);
    	
    	System.out.println(numbers.toString());
    	
    	long time = System.nanoTime();
    	for(int i = 0; i < ELEMS; i++) {
    		numbers.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	
    	System.out.println("Adding " + ELEMS
                 + " as first in ArrayList took " + time
                 + "ns (" + time / TO_MS + "ms)");
    	
    	time = System.nanoTime();
    	for(int i = 0; i < ELEMS; i++) {
    		numbersLinked.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	
    	 System.out.println("Adding " + ELEMS
                 + " as first in LinkedList took " + time
                 + "ns (" + time / TO_MS + "ms)");
    	 
		time = System.nanoTime();
    	for(int i = 0; i < ELEMS_TO_READ; i++) {
    		tmp = numbers.get(1000);
    	}
    	time = System.nanoTime() - time;
    	
    	System.out.println("Reading " + ELEMS_TO_READ
                 + " from ArrayList took " + time
                 + "ns (" + time / TO_MS + "ms)");
    	
    	time = System.nanoTime();
    	for(int i = 0; i < ELEMS_TO_READ; i++) {
    		tmp = numbers.get(1000);
    	}
    	time = System.nanoTime() - time;
    	
    	System.out.println("Reading " + ELEMS_TO_READ
                 + " from LinkedList took " + time
                 + "ns (" + time / TO_MS + "ms)");
    	
    	//7
    	TreeMap<String, Long> population = new TreeMap<>();
    	population.put("Africa", 1110635000L);
    	population.put("Americas", 972005000L);
    	population.put("Antarctica", 0L);
    	population.put("Asia", 4298723000L);
    	population.put("Europe",  742452000L);
    	population.put("Oceania", 1110635000L);
    	
    	
    }
}
