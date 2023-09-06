package seminar03.cars;

import seminar03.library.Sweeper;

/**
 * класс для описания автомобилей - подметальщиков улиц
 * заранее заданы:
 * бренд подметальщиков Bucher
 * кузов - мини
 * число колес = 4
 */
public class Bucher extends Sweeper {
    public Bucher(String model, String color, String fuel, String gearbox, double engineVolume) {
        super("Bucher", model, color, "mini", 4, fuel, gearbox, engineVolume);
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

    @Override
    public void sweepStreet() {
        System.out.printf("Car %s of %s is sweeping\n", this.getModel(), this.getBrand());
    }
}
