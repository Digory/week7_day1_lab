public class Radio extends Component{

    private String station;

    public Radio(String station) {
        this.station = station;
    }

    public String tune(String newStation){
        this.station = newStation;
        return station;
    }


    @Override
    public String play() {
        return station;
    }

}
