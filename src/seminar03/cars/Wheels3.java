package seminar03.cars;

import seminar03.library.Car;

/**
 * класс для описания трехколесных автомобилей
 * заранее задано число колес = 3
 */
public class Wheels3 extends Car {
    public Wheels3(String brand, String model, String color, String body, String fuel, String gearbox, double engineVolume) {
        super(brand, model, color, body, 3, fuel, gearbox, engineVolume);
    }

    /**
     * движение
     */
    @Override
    public void driving() {
        System.out.printf("Tricycle car %s of %s is driving\n", this.getModel(), this.getBrand());
    }

    /**
     * переключение передач
     */
    @Override
    public void gearShifting() {
        System.out.println("Gear was shifted");
    }

    /**
     * обслуживание
     */
    @Override
    public void service() {
        System.out.println("Car is servicing");
    }

    /**
     * включение/выключение фар
     */
    @Override
    public boolean isHeadlightOn() {
        return !super.getHeadlightsOn();
    }

    /**
     * включение/выключение дворников
     */
    @Override
    public boolean isWipersOn() {
        return !super.getWipersOn();
    }
}
