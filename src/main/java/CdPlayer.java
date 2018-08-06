public class CdPlayer extends Component{
    private int numberOfCDs;
    private String CD;

    public CdPlayer(int numberOfCDs) {
        this.numberOfCDs = numberOfCDs;
        on = false;
        CD = "";
    }

    public void putInCd(String CD){
        this.CD = CD;
    }

    public int getNumberOfCDs() {
        return numberOfCDs;
    }

    @Override
    public String play() {
        return CD;
    }


}
