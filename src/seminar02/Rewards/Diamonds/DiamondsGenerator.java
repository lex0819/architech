package seminar02.Rewards.Diamonds;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;

/**
 * Класс-фабрика бриллиантов
 * фабричный класс создает объекты типа DiamondsReward
 */

public class DiamondsGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new DiamondsReward();
    }
}
