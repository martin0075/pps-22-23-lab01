import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {


    private CircularList circularList;



    @BeforeEach
    void beforeEach(){
        circularList=new CircularListImpl(new ArrayList<>());
    }

    public void addElement(){
        circularList.add(2);
        circularList.add(3);
        circularList.add(5);
    }

    @Test
    void testAddElement(){
        addElement();
        assertEquals(3, circularList.getList().size());
        circularList.add(2);
        assertEquals(4, circularList.getList().size());
    }


    @Test
    void testSizeList(){
        addElement();
        assertEquals(3, circularList.size());
    }

    @Test
    void testIsEmpty(){
        assertEquals(true, circularList.isEmpty());
        addElement();
        assertEquals(false, circularList.isEmpty());
    }

    @Test
    void testNext(){
        addElement();

        assertEquals(3,circularList.next().get());
        assertEquals(5,circularList.next().get());
        assertEquals(2,circularList.next().get());
        assertEquals(3,circularList.next().get());
    }

    @Test
    void testPrevious(){
        addElement();

        assertEquals(5,circularList.previous().get());
        assertEquals(3,circularList.previous().get());
        assertEquals(2,circularList.previous().get());
        assertEquals(5,circularList.previous().get());

    }

    @Test
    void testReset(){
        addElement();

        assertEquals(3,circularList.next().get());

        circularList.reset();

        assertEquals(3,circularList.next().get());

    }

}
