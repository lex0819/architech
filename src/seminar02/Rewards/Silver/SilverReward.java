package seminar02.Rewards.Silver;

import seminar02.Abstractions.IGameItem;

/**
 * Класс содержит награду-серебро
 */
public class SilverReward implements IGameItem {
    @Override
    public String open() {
        return "Silver";
    }
}
