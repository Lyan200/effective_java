package chapter7.tip30;

import java.util.Random;

/**
 * Created by snakecc on 14-3-19.
 */
public class Foot {
    public static void main(String[] args){
        Random random = new Random();
        for(int i=0;i<300;i++)
        System.out.println(random.nextInt(300));
    }
}
