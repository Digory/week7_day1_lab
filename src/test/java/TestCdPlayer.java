import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCdPlayer {
    private CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer(3);
    }

    @Test
    public void getNumberOfCDs(){
        assertEquals(3, cdPlayer.getNumberOfCDs());
    }
}
