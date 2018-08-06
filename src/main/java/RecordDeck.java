public class RecordDeck extends Component{

    private int recordSpeed;

    public RecordDeck(int recordSpeed) {
        this.recordSpeed = recordSpeed;
    }


    public int getRecordSpeed() {
        return recordSpeed;
    }

    @Override
    public String play() {
        return "You're listening to a great record";
    }

}
