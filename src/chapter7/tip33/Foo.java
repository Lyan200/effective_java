package chapter7.tip33;

import java.util.Random;

/**
 * Created by snakecc on 14-3-19.
 * String 的连接符+性能比较低要求，要连接n个字符串就会使用n的平方级的时间
 */
public class Foo {

    /**
     * 这个破方法会带来巨大的性能差，请使用StringBuffer 来代替ssString
     * @return
     */
    String statement(){
//        String s = "";
//        for(int i = 0; i< numItems(); i++){
//            s+= lineForItems(i);
//        }
//        return s;
        StringBuffer s = new StringBuffer(numItems()*numItems());
        for(int i = 0; i<numItems(); i++){
            s.append(lineForItems(i));
        }
        return s.toString();
    }

    private int numItems() {
        Random random  = new Random();
        return random.nextInt(400);
    }

    private String lineForItems(int i) {
        return null;
    }
}
