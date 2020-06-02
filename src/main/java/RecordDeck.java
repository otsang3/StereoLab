public class RecordDeck extends Component {

    private String recordName;
    private int playSpeed;
    private boolean isPlaying;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.recordName = null;
        this.playSpeed = 15;
        this.isPlaying = false;
    }

    public String getRecordName() {
        return recordName;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }

    public void playRecord(String recordName){
        this.setRecordName(recordName);
        this.isPlaying = true;
    }

    public boolean getIsPlaying(){
        return this.isPlaying;
    }

    public void stopPlaying(){
        if (this.isPlaying == true){
            this.isPlaying = false;
        }
    }
}
