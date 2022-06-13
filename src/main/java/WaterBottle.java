public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume=volume;
    }

    public int getVolume(){
        return volume;
    }

    public int loseVolume(){
        return volume - 10;
    }

    public void emptyBottle(){
        volume = 0;
    }

    public void fillBottle(){
        volume = 100;
    }
}
