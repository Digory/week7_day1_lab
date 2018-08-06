import java.util.ArrayList;

public class Stereo {
    private ArrayList<Component> components;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;
    private String name;

    public Stereo(String name, Radio radio, RecordDeck recordDeck, CdPlayer cdPlayer) {
        this.name = name;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cdPlayer = cdPlayer;
        this.components = new ArrayList<>();
    }

    public String tuneRadio(String station){
        return radio.tune(station);
    }

    public String playCD(String CD){
        cdPlayer.putInCd(CD);
        return cdPlayer.play();
    }

    public String playall(){
        String returned = "";
        for(Component component : components){
            returned += component.play();
        }
        return returned;
    }
}
