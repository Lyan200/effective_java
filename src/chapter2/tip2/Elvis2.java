package chapter2.tip2;

import java.io.ObjectStreamException;

/**
 * Created by snakecc on 14-3-17.
 * sinngleton with static factory
 */
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2(){
        //...
    }

    /**
     * 提供了可变性，特别是在多线程的情况下
     * @return
     */
    public static Elvis2 getInstance(){
        return INSTANCE;
    }

    private Object readResulve() throws ObjectStreamException {

        /**
         * return the one true Elvis2 and let the gc take care of the Elvis2 impersonator
         */
        return INSTANCE;
    }

}
