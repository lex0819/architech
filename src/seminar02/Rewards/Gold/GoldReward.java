package seminar02.Rewards.Gold;

import seminar02.Abstractions.IGameItem;

/**
 * Класс содержит награду-золото
 */
public class GoldReward implements IGameItem {

    @Override
    public String open() {
        return "Gold";
    }
}
