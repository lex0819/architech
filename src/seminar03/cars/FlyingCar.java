package seminar03.cars;

import seminar03.library.Car;

/**
 * класс для описания летающих автомобилей
 */
public class FlyingCar extends Car {
    public FlyingCar(String brand, String model, String color, String body, int wheelsCount, String fuel, String gearbox, double engineVolume) {
        super(brand, model, color, body, wheelsCount, fuel, gearbox, engineVolume);
    }

    /**
     * движение
     */
    @Override
    public void driving() {
        System.out.println("Car is driving");
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

    public void flying(){
        System.out.printf("Car %s of %s is flying\n", this.getModel(), this.getBrand());
    }
}
