package seminar02.Core;

import seminar02.Abstractions.ItemGenerator;
import seminar02.Rewards.Diamonds.DiamondsGenerator;
import seminar02.Rewards.Emeralds.EmeraldsGenerator;
import seminar02.Rewards.Gold.GoldGenerator;
import seminar02.Rewards.Silver.SilverGenerator;
import seminar02.Rewards.Platinum.PlatinumGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core {
    // Логика игры
    public void run() {
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new SilverGenerator()); // награда серебро
        generatorList.add(new GoldGenerator());// награда золото
        generatorList.add(new PlatinumGenerator()); // награда платина
        generatorList.add(new EmeraldsGenerator()); // награда изумруды
        generatorList.add(new DiamondsGenerator()); // награда бриллианты


        ItemGenerator myReward = generatorList.get(intProbabilityRandom());
        System.out.println(myReward.openReward());
    }

    /**
     * @return номер элемента в списке наград
     * в начале списка более дешевые награды
     * в конце - более дорогие
     * сперва генерируем вероятность, чтобы ограничить дорогие награды
     * затем генерируем номер самой награды в списке наград
     */
    private int intProbabilityRandom(){

        double range = Math.random(); // вероятность
        Random rand = new Random(); // номер в массиве наград

        if (range < 0.4) {
            // выпадает редко
             return rand.nextInt(5); // выбираем изо всех номеров до алмазов включительно

        } else if (range < 0.6) {
            // выпадает чуть чаще,
            return rand.nextInt(4); // выбираем из номеров начала и середины до изумрудов включительно

        } else if (range < 0.8) {
            // выпадает еще чаще,
            return rand.nextInt(3); // выбираем из номеров начала и середины до платины включительно

        } else {
            // выпадает всегда
            return rand.nextInt(2); // выбираем только из начальных номеров массива
        }
    }
}
