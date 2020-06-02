import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void setUp(){
        cdPlayer = new CDPlayer("Sony", "B");
        cdPlayer.setCdName("Jazz Music");
    }

    @Test
    public void canGetCdName(){
        assertEquals("Jazz Music", cdPlayer.getCdName());
    }

    @Test
    public void canSetCd(){
        cdPlayer.setCdName("Rock Music");
        assertEquals("Rock Music", cdPlayer.getCdName());
    }

    @Test
    public void canGetIsPlaying(){
        assertEquals(false, cdPlayer.getIsPlaying());
    }

    @Test
    public void canPlayCd(){
        cdPlayer.playCd("Linkin Park");
        assertEquals(true, cdPlayer.getIsPlaying());
    }

    @Test
    public void canStopPlayingCd(){
        cdPlayer.playCd("Linkin Park");
        cdPlayer.stopPlaying();
        assertEquals(false, cdPlayer.getIsPlaying());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("B", cdPlayer.getModel());
    }
}
