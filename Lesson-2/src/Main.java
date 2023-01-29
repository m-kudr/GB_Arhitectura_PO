import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new Rub10Generator());

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(rnd.nextInt() % 2 == 0 ? 0 : 1);
            switch ()

            System.out.print(i + 1);
            System.out.print(" ");
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}

abstract class ItemGenerator {
    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();

}

interface GameItem {
    void open();
}

class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}

class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}

class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}

class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}

class Rub10Generator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new Rub10Reward();
    }
}

class Rub10Reward implements GameItem {
    @Override
    public void open() {
        System.out.println("10Rub");
    }
}