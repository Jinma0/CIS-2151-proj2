package proj2;

import java.util.Random;

public class Ogre extends Enemy{
    public Ogre(int weight, int height) {
        super(new Random().nextInt(81) + 120, new Random().nextInt(101) + 200);
    }

    @Override
    public void attack() {
        System.out.println("Ugh!");
    }
}
