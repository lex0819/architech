package seminar02.Rewards.Gold;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
