import com.bartram.People.Pilot;
import com.bartram.People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Berthie Bert", Rank.CAPTAIN, 12345);
    }

    @Test
    public void canGetPilotLicenceNumber() {
        assertEquals(12345, pilot.getPilotLicenceNumber());
    }

    @Test
    public void canSetPilotLicenceNumber(){
        pilot.setPilotLicenceNumber(98765);
        assertEquals(98765, pilot.getPilotLicenceNumber());
    }

    @Test
    public void canFlyPlane() {
        String expectedMessage = "UP, UP and AWAY!";
        assertEquals(expectedMessage, pilot.flyPlane());
    }

    @Test
    public void inheritedGetName(){
        assertEquals("Berthie Bert", pilot.getName());
    }

    @Test
    public void inheritedGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
}
