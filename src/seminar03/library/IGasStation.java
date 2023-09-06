package seminar03.library;

/**
 * интерфейс Заправочная станция
 */
public interface IGasStation {

    /**
     * метод заправка топливом
     * @return вид топлива, которым заправлен автомобиль
     */
    String refueling();

    /**
     * метод протирка лобового стекла
     * @return лобовое стекло протерто
     */
    String cleaningWindshield();

    /**
     * протирка фар
     * @return фары протерты
     */
    String cleaningHeadlights();

    /**
     * метод протирка зеркал
     * @return зеркала протерты
     */
    String cleaningMirrors();
}
