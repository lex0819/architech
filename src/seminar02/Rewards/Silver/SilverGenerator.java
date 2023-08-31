package seminar02.Rewards.Silver;

import seminar02.Abstractions.IGameItem;
import seminar02.Abstractions.ItemGenerator;


public class SilverGenerator extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
}
