package proj2;

import java.util.Random;

public class Goblin extends Enemy{
    public Goblin(int weight, int height) {
        super(new Random().nextInt(6) + 5, new Random().nextInt(31) + 70);
    }

    public Goblin() {}

    @Override
    public void attack() {
        System.out.println("Gurgle!");
    }
}
