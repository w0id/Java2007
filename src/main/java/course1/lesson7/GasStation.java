package course1.lesson7;

public class GasStation {

    private int avaliable;

    public GasStation(int avaliable) {
        this.avaliable = avaliable;
    }

    public int getAvaliable() {
        return avaliable;
    }

    public void refill(int amount) {
        this.avaliable -= amount;
    }

    public void setAvaliable(int avaliable) {
        this.avaliable = avaliable;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "avaliable=" + avaliable +
                "}";
    }

    public void info() {
        System.out.println(this);
    }
}
