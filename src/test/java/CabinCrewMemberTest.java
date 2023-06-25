import com.bartram.People.CabinCrewMember;
import com.bartram.People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jackie Jacks", Rank.LEAD_ATTENDANT);
    }

    @Test
    public void inheritedGetRank() {
        assertEquals(Rank.LEAD_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void inheritedSetName() {
        cabinCrewMember.setName("Norma Norms");
        assertEquals("Norma Norms", cabinCrewMember.getName());
    }

    @Test
    public void inheritedSetRank() {
        cabinCrewMember.setRank(Rank.FLIGHT_ATTENDANT);
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void inheritedGetName() {
        assertEquals("Jackie Jacks", cabinCrewMember.getName());
    }

    @Test
    public void canSpeakToPassengers() {
        String expectedMessage = "Thank you for flying JavaAir!";
        assertEquals(expectedMessage, cabinCrewMember.messageToPassengers());
    }
}
