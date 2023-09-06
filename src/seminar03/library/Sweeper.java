package seminar03.library;

/**
 * абстрактный класс автомобилей для подметания улиц
 */
public abstract class Sweeper extends Car{

    public Sweeper(String brand, String model, String color, String body, int wheelsCount, String fuel, String gearbox, double engineVolume) {
        super(brand, model, color, body, wheelsCount, fuel, gearbox, engineVolume);
    }

    /**
     * подметать улицу
     */
    public abstract void sweepStreet();
}
