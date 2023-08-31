package seminar02.Rewards.Emeralds;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;

/**
 * Класс-фабрика изумрудов
 * фабричный класс создает объекты типа EmeraldsReward
 */
public class EmeraldsGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new EmeraldsReward();
    }
}
