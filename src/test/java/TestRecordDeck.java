import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRecordDeck {
    private RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck(74);}

    @Test
    public void getRecordSpeed(){
        assertEquals(74, recordDeck.getRecordSpeed());
    }


}
