public class Stereo {

    private Radio radio;
    private RecordDeck recordDeck;
    private CDPlayer cdPlayer;
    private int volume;
    private String name;

    public Stereo(String name) {
        this.radio = new Radio();
        this.recordDeck = new RecordDeck("Sony", "C");
        this.cdPlayer = new CDPlayer("Sony", "D");
        this.volume = 2;
        this.name = name;
    }

    public String getRadio() {
        return radio.getStation();
    }

    public String getRecordDeck() {
        return recordDeck.getRecordName();
    }

    public String getCdPlayer() {
        return cdPlayer.getCdName();
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public void tuneRadio(String station){
        this.radio.tune(station);
    }

    public void playCd(String cdName){
        if (this.cdPlayer.getIsPlaying()){
            this.cdPlayer.stopPlaying();
        }
        this.cdPlayer.playCd(cdName);
    }

    public void raiseVolume(){
        if (this.volume <= 10){
            this.volume += 2;
        }
    }

    public void lowerVolume(){
        if (this.volume > 1){
            this.volume -= 2;
        }
    }

    public void playRecord(String recordName){
        if (this.recordDeck.getIsPlaying()){
            this.recordDeck.stopPlaying();
        }
        this.recordDeck.playRecord(recordName);
    }
}
