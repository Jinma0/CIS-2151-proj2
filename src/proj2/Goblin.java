package proj2;

import java.util.Random;

public class Goblin extends Enemy{
    public Goblin(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void attack() {
        System.out.println("Gurgle!");
    }

    int minimumWeight = 5;
    int maximumWeight = 10;

    Random number = new Random();


    int randomNumber = number.nextInt(maximumWeight - minimumWeight + 1) + minimumWeight;


}
