package proj2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        Random number = new Random();

        for (int i = 0; i < 100; i++){
            int randomNumber = number.nextInt(4) + 1;

            switch (randomNumber){
                case 1: enemies.add(new Goblin());
                break;

                case 2: enemies.add(new Ghost());
                break;

                case 3: enemies.add(new Ogre());
                break;

                case 4: enemies.add(new Dragon());
                break;
            }
        }

        for (Enemy enemy: enemies){
            enemy.attack();
        }
    }
}