package proj2;

import java.util.Random;

public class Dragon extends Enemy{
    public Dragon(int weight, int height) {
        super(new Random().nextInt(501) + 1000, new Random().nextInt(1251) + 750);
    }

    public Dragon() {}

    @Override
    public void attack() {
        System.out.println("Rawr!");
    }
}
