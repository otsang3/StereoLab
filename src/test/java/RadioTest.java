import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setUp(){
        radio = new Radio();
    }

    @Test
    public void canGetStation(){
        radio.tune("Clyde 1");
        assertEquals("Clyde 1", radio.getStation());
    }
}
