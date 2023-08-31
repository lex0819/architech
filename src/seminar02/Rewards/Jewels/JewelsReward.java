package seminar02.Rewards.Jewels;

import seminar02.Abstractions.IGameItem;

public class JewelsReward implements IGameItem {
    @Override
    public String open() {
        return "Jewels";
    }
}
