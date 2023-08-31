package seminar02.Rewards.Gold;

import seminar02.Abstractions.IGameItem;

public class GoldReward implements IGameItem {

    @Override
    public String open() {
        return "Gold";
    }
}
