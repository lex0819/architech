package seminar02.Rewards.Platinum;

import seminar02.Abstractions.IGameItem;

/**
 * Класс содержит награду-платину
 */
public class PlatinumReward implements IGameItem {
    @Override
    public String open() {
        return "Platinum";
    }
}
