package seminar02.Rewards.Silver;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;

/**
 * Класс-фабрика серебра
 * фабричный класс создает объекты типа SilverReward
 */
public class SilverGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
