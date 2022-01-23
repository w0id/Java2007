package course1.lesson7;

public class Car {

    /**
     * объем бензобака
     */
    private int volume;

    public Car(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void takeGasoline(GasStation station) {
        station.refill(volume);
    }

}
