package chapter4.tip15;

/**
 * Created by snakecc on 14-3-18.
 * 构造函数一定不能调用可被改写的方法，以下是个反例。
 *
 *
 * 对于这个问题，最好的法子是禁止子类化，一个是将构造函数设为私有,然后提供工厂方法，另一个是
 * 就是设置为final的类
 */
public class Super {
    public Super(){
        m();
    }
    //这里这个方法被构造函数调用了，而且是个public方法，就会导致一些错误
    public void m(){
        System.out.println("i am super constructor");
    }
}
