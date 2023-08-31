package seminar02.Core;

import seminar02.Abstractions.ItemGenerator;
import seminar02.Rewards.Gold.GoldGenerator;
import seminar02.Rewards.Silver.SilverGenerator;
import seminar02.Rewards.Jewels.JewelsGenerator;

import java.util.ArrayList;
import java.util.List;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new JewelsGenerator());
        ItemGenerator gold = generatorList.get(0);
        System.out.println(gold.openReward());
        ItemGenerator silver = generatorList.get(1);
        System.out.println(silver.openReward());
        ItemGenerator jewels = generatorList.get(2);
        System.out.println(jewels.openReward());
    }
}
