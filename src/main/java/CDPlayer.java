public class CDPlayer extends Component {

    private String cdName;
    private boolean isPlaying;

    public CDPlayer(String make, String model) {
        super(make, model);
        this.cdName = null;
        this.isPlaying = false;
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName;
    }

    public void playCd(String cdName){
        this.setCdName(cdName);
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
