import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;

    @Before
    public void setUp(){
        stereo = new Stereo("Stereo A");
    }

    @Test
    public void canTuneRadio(){
        stereo.tuneRadio("Clyde 1");
        assertEquals("Clyde 1", stereo.getRadio());
    }

    @Test
    public void canPlayRecordDeck(){
        stereo.playRecord("Elvis Presley");
        assertEquals("Elvis Presley", stereo.getRecordDeck());
    }

    @Test
    public void canPlayCd(){
        stereo.playCd("Celine Dion");
        assertEquals("Celine Dion", stereo.getCdPlayer());
    }

    @Test
    public void canRaiseVolume(){
        stereo.raiseVolume();
        assertEquals(4, stereo.getVolume());
    }

    @Test
    public void canLowerVolume(){
        stereo.lowerVolume();
        assertEquals(0, stereo.getVolume());
    }

}
