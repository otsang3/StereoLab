import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    Mp3Player mp3Player;

    @Before
    public void setUp(){
        mp3Player = new Mp3Player("Sony", "E");
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", mp3Player.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("E", mp3Player.getModel());
    }

    @Test
    public void canConnectToStereo(){
        Stereo stereo = new Stereo("Sony");
        assertEquals("Sony", mp3Player.connect(stereo));
    }
}
