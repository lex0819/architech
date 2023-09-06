package seminar03.cars;

import seminar03.library.Car;

/**
 * класс автомобилей марки Тойота
 * заранее задана только марка
 */
public class Toyota extends Car {

    public Toyota(String model, String color, String body, int wheelsCount, String fuel, String gearbox, double engineVolume) {
        super("Toyota", model, color, body, wheelsCount, fuel, gearbox, engineVolume);
    }

    /**
     * движение
     */
    @Override
    public void driving() {
        System.out.printf("Toyota %s is driving\n", this.getModel());
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
