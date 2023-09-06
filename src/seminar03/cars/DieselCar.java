package seminar03.cars;

import seminar03.library.Car;
import seminar03.library.IGasStation;

/**
 * класс для описания автомобилей на дизельном топливе
 * заранее задан тип топлива дизель
 */
public class DieselCar extends Car implements IGasStation {
    public DieselCar(String brand, String model, String color, String body, int wheelsCount, String gearbox, double engineVolume) {
        super(brand, model, color, body, wheelsCount, "diesel", gearbox, engineVolume);
    }

    /**
     * движение
     */
    @Override
    protected void driving() {
        System.out.println("Car is driving");
    }

    /**
     * переключение передач
     */
    @Override
    protected void gearShifting() {
        System.out.println("Gear was shifted");
    }

    /**
     * обслуживание
     */
    @Override
    protected void service() {
        System.out.println("Car is servicing");
    }

    /**
     * включение/выключение фар
     */
    @Override
    protected boolean isHeadlightOn() {
        return !super.getHeadlightsOn();
    }

    /**
     * включение/выключение дворников
     */
    @Override
    protected boolean isWipersOn() {
        return !super.getWipersOn();
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
