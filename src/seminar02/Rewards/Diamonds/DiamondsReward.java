package seminar02.Rewards.Diamonds;

import seminar02.Abstractions.IGameItem;

/**
 * Класс содержит награду-бриллианты
 */
public class DiamondsReward implements IGameItem {
    @Override
    public String open() {
        return "Diamonds";
    }
}
