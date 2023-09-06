package seminar03.library;

/**
 * абстрактный класс Car
 * прототип всех автомобилей
 */
public abstract class Car {

    private String brand; // марка
    public String getBrand(){return brand;}
    private String model; // модель
    public String getModel(){return model;}

    private String color; // цвет
    public String getColor(){return color;}
    private String body; // тип кузова
    public String getBody(){return body;}
    private int wheelsCount; // число колёс
    public int getWheelsCount(){return wheelsCount;}
    private String fuel; // тип топлива
    public String getFuel(){return fuel;}
    private String gearbox; // тип коробки передач
    public String getGearbox(){return gearbox;}
    private double engineVolume; // объём двигателя
    public double getEngineVolume(){return engineVolume;}
    private boolean headlightsOn = false; // фары выключены
    public boolean getHeadlightsOn(){return headlightsOn;}
    private boolean wipersOn = false; // дворники выключены
    public boolean getWipersOn(){return wipersOn;}

    public Car(String brand, String model, String color, String body, int wheelsCount, String fuel, String gearbox, double engineVolume){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.body = body;
        this.wheelsCount = wheelsCount;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineVolume = engineVolume;
    }

    /**
     * движение
     */
    protected abstract void driving();

    /**
     * переключение передач
     */
    protected abstract void gearShifting();

    /**
     * обслуживание
     */
    protected abstract void service();

    /**
     * включение/выключение фар
     */
    protected abstract boolean isHeadlightOn();

    /**
     * включение/выключение дворников
     */
    protected abstract boolean isWipersOn();
}
