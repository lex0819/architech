package seminar02.Rewards.Platinum;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;

/**
 * Класс-фабрика драгоценных камней
 * фабричный класс создает объекты типа PlatinumReward
 */
public class PlatinumGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new PlatinumReward();
    }
}
