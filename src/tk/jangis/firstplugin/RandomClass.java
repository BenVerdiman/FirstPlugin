package tk.jangis.firstplugin;

import java.util.Random;

public class RandomClass {
   public int randomInt(int min, int max){
        Random random = new Random();
        return random.ints(min, max).findFirst().getAsInt();
    }
}
