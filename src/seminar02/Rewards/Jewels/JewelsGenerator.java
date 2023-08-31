package seminar02.Rewards.Jewels;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;

public class JewelsGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new JewelsReward();
    }
}
