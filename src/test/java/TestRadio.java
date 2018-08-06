import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRadio {
    private Radio radio;

    @Before
    public void before(){
        radio = new Radio("Radio 1");
    }

    @Test
    public void tuneReturnsCorrectStation(){
        assertEquals("Classic FM", radio.tune("Classic FM"));
    }
}
