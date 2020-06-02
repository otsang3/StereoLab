public class Mp3Player extends Component implements IConnect {

    public Mp3Player(String make, String model) {
        super(make, model);
    }

    public String connect(Stereo stereo){
        return stereo.getName();
    }



}
