import lab01Step2.CircularListStep2;
import lab01Step2.CircularListStep2Impl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularListTestStep2 {

    private CircularListStep2 circularListStep2;

    @BeforeEach
    void beforeEach(){
        circularListStep2=new CircularListStep2Impl(new ArrayList<>());
    }

    public void addElement(){
        circularListStep2.add(1);
        circularListStep2.add(2);
        circularListStep2.add(3);
    }

    @Test
    void testAddElement(){
        addElement();
        assertEquals(3, circularListStep2.getList().size());
        circularListStep2.add(2);
        assertEquals(4, circularListStep2.getList().size());
    }

    @Test
    void testSizeList(){
        addElement();

        assertEquals(3,circularListStep2.size());
    }

    @Test
    void testIsEmpty(){
        assertEquals(true, circularListStep2.isEmpty());
        addElement();
        assertEquals(false, circularListStep2.isEmpty());
    }

    @Test
    void testForwardIterator(){
        addElement();

        assertEquals(2,circularListStep2.forwardIterator().next());
        assertEquals(3,circularListStep2.forwardIterator().next());
        assertEquals(1,circularListStep2.forwardIterator().next());
        assertEquals(2,circularListStep2.forwardIterator().next());
    }

    @Test
    void testBackForwardIterator(){
        addElement();

        assertEquals(3,circularListStep2.backwardIterator().next());
        assertEquals(2,circularListStep2.backwardIterator().next());
        assertEquals(1,circularListStep2.backwardIterator().next());
        assertEquals(3,circularListStep2.backwardIterator().next());

    }
}
