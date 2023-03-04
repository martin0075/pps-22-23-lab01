import lab01Step2.CircularListStep2;
import lab01Step2.CircularListStep2Impl;
import lab01Step3.CircularListStep3;
import lab01Step3.CircularListStep3Impl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularListTestStep3 {

    private CircularListStep3 circularListStep3;

    @BeforeEach
    void beforeEach(){
        circularListStep3=new CircularListStep3Impl(new ArrayList<>());
    }

    public void addElement(){
        circularListStep3.add(5);
        circularListStep3.add(2);
        circularListStep3.add(4);
        circularListStep3.add(3);
        circularListStep3.add(6);
    }

    @Test
    void testAddElement(){
        addElement();
        assertEquals(5, circularListStep3.getList().size());
        circularListStep3.add(2);
        assertEquals(6, circularListStep3.getList().size());
    }

    @Test
    void testFilteredNext() {
        addElement();

        assertEquals(Optional.empty(), circularListStep3.filteredNext(v -> v > 10));
        assertEquals(Optional.of(4), circularListStep3.filteredNext(v -> v>2 && v%2==0));
        assertEquals(Optional.of(6), circularListStep3.filteredNext(v -> v>2 && v%2==0));
        assertEquals(Optional.of(4), circularListStep3.filteredNext(v -> v>2 && v%2==0));

        assertEquals(Optional.of(3), circularListStep3.filteredNext(v -> v%2!=0));
        assertEquals(Optional.of(5), circularListStep3.filteredNext(v -> v%2!=0));

        assertEquals(Optional.of(2), circularListStep3.filteredNext(v -> v<4));
        assertEquals(Optional.of(3), circularListStep3.filteredNext(v -> v<4));
        assertEquals(Optional.of(2), circularListStep3.filteredNext(v -> v<4));


    }
}
