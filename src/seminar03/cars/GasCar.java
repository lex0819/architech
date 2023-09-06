package seminar03.cars;

import seminar03.library.Car;
import seminar03.library.IGasStation;

/**
 * класс для описания автомобилей на бензиновом топливе
 * заранее задано топливо бензин
 */
public class GasCar extends Car implements IGasStation {
    public GasCar(String brand, String model, String color, String body, int wheelsCount, String gearbox, double engineVolume) {
        super(brand, model, color, body, wheelsCount, "gas", gearbox, engineVolume);
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
    public boolean isHeadlightOn() { return !super.getHeadlightsOn();
    }

    /**
     * включение/выключение дворников
     */
    @Override
    public boolean isWipersOn() { return !super.getWipersOn();
    }

    /**
     * метод заправка топливом
     * @return вид топлива, которым заправлен автомобиль
     */
    @Override
    public String refueling() {
        return super.getFuel();
    }

    /**
     * метод протирка лобового стекла
     * @return лобовое стекло протерто
     */
    @Override
    public String cleaningWindshield() { return "Windshield has cleaned";
    }

    /**
     * протирка фар
     * @return фары протерты
     */
    @Override
    public String cleaningHeadlights() {
        return "Headlights have cleaned";
    }

    /**
     * метод протирка зеркал
     * @return зеркала протерты
     */
    @Override
    public String cleaningMirrors() {
        return "Mirrors have cleaned";
    }
}
