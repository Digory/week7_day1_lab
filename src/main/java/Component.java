public abstract class Component implements IPlay{

    protected boolean on;
    protected int volume;

    public Component(){
        volume = 0;
    }

    public void turnUp(){
        volume++;
    }

    public void turnDown(){
        volume--;
    }

    public void switchOn(){
        on = true;
    }

    public void switchOff(){
        on = false;
    }


}
