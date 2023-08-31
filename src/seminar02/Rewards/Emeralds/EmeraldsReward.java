package seminar02.Rewards.Emeralds;

import seminar02.Abstractions.IGameItem;

/**
 * Класс содержит награду-изумруды
 */
public class EmeraldsReward implements IGameItem{
    @Override
    public String open() {
        return "Emeralds";
    }
}
