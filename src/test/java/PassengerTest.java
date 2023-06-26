import com.bartram.People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Joe Jo", 4);
    }

    @Test
    public void canGetBags(){
        assertEquals(4, passenger.getBags());
    }

    @Test
    public void canSetBags(){
        passenger.setBags(3);
        assertEquals(3, passenger.getBags());
    }

    @Test
    public void inheritedGetName(){
        assertEquals("Joe Jo", passenger.getName());
    }
}

