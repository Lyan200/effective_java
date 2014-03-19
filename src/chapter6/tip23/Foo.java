package chapter6.tip23;

import java.math.BigInteger;

/**
 * Created by snakecc on 14-3-18.
 * 检查参数的有效性
 */
public class Foo {

    public BigInteger mod(BigInteger m){
        //这里用的是一般的判断来检查
        if(m.signum()<=0){
            throw new ArithmeticException("Modulus not positive!");
        }
        //用assertions断言来检查参数
        //如：assert  value>=0:"Value should be bigger than 0:"+value;
        //要用的话就要使用try catch AssertionError了
        assert m.signum()>0;

        //.....
        //自己算去
        return null;
    }
}
