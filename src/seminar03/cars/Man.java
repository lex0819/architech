package seminar03.cars;

import seminar03.library.Truck;

/**
 * класс описывает фуры фирмы Man
 * заданы заранее:
 * число колес = 8
 * бренд Man
 * кузов фура
 */
public class Man extends Truck {
    public Man(String model, String color, String fuel, String gearbox, double engineVolume) {
        super("Man", model, color, "truck", 8, fuel, gearbox, engineVolume);
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

    /**
     * включение/выключение противотуманных фар
     */
    @Override
    public boolean isFogLightsOn() {
        return !super.getFogLightsOn();
    }

    /**
     * перевозка груза
     */
    @Override
    public void transportingGoods() {
        System.out.printf("Truck %s of %s is transporting goods.", this.getModel(), this.getBrand());
    }
}
