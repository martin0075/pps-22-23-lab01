package lab01Step2;


import java.util.Iterator;
import java.util.List;

public interface CircularListStep2 {

    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * Provides the current size of the list
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Provide the next element of the list
     * @return an iterator which yields next elements circularly
     */
    Iterator forwardIterator();

    /**
     * Provide the previous element of the list
     * @return an iterator which yields previous elements circularly
     */
    Iterator backwardIterator();

    List<Integer> getList();
}
