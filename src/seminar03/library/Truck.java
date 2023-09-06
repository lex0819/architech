package seminar03.library;

/**
 * абстрактный класс для грузовых автомобилей типа фуры
 */
public abstract class Truck extends Car{
    private boolean fogLightsOn = false; // противотуманные фары
    public boolean getFogLightsOn(){return fogLightsOn;}
    public Truck(String brand, String model, String color, String body, int wheelsCount, String fuel, String gearbox, double engineVolume) {
        super(brand, model, color, body, wheelsCount, fuel, gearbox, engineVolume);
    }

    /**
     * включение/выключение противотуманных фар
     */
    public abstract boolean isFogLightsOn();

    /**
     * перевозка груза
     */
    public abstract void transportingGoods();
}
