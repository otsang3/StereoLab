import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    private RecordDeck recordDeck;

    @Before
    public void setUp(){
        recordDeck = new RecordDeck("Sony", "A");
        recordDeck.setRecordName("Jazz Music");
    }

    @Test
    public void canGetRecordName(){
        assertEquals("Jazz Music", recordDeck.getRecordName());
    }

    @Test
    public void canGetPlaySpeed(){
        assertEquals(15, recordDeck.getPlaySpeed());
    }

    @Test
    public void canSetRecord(){
        recordDeck.setRecordName("Rock Music");
        assertEquals("Rock Music", recordDeck.getRecordName());
    }

    @Test
    public void canSetPlaySpeed(){
        recordDeck.setPlaySpeed(10);
        assertEquals(10, recordDeck.getPlaySpeed());
    }

    @Test
    public void canGetIsPlaying(){
        assertEquals(false, recordDeck.getIsPlaying());
    }

    @Test
    public void canPlayRecord(){
        recordDeck.playRecord("Linkin Park");
        assertEquals(true, recordDeck.getIsPlaying());
    }

    @Test
    public void canStopPlayingRecord(){
        recordDeck.playRecord("Linkin Park");
        recordDeck.stopPlaying();
        assertEquals(false, recordDeck.getIsPlaying());
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("A", recordDeck.getModel());
    }
}
