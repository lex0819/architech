package seminar02.Rewards.Silver;

import seminar02.Abstractions.IGameItem;

public class SilverReward implements IGameItem {
    @Override
    public String open() {
        return "Silver";
    }
}
