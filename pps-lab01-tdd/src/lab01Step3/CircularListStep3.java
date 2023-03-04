package lab01Step3;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface CircularListStep3 {

    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * @return the next element that satisfies a given condition
     */
    Optional<Integer> filteredNext(Predicate<Integer> value);

    List<Integer> getList();
}
