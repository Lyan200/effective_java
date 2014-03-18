package chapter4.tip15;

import java.util.Date;

/**
 * Created by snakecc on 14-3-18.
 * 这里会打2次时间，一个为null 因为构造函数调了个被复写的方法，这个是不对的
 *
 */
public class Sub extends Super {
    private final Date date;

    Sub(){
        date = new Date();
    }
    @Override
    public void m(){
        System.out.println(date);
    }

    public static void main(String[] args){
        Sub s = new Sub();
        s.m();
    }
}
