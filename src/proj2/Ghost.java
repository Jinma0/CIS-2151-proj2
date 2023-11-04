package proj2;

import java.util.Random;

public class Ghost extends Enemy{
    public Ghost(int weight, int height) {
        super(0, new Random().nextInt(61) + 90);
    }

    @Override
    public void attack() {
        System.out.println("Boo!");
    }
}
