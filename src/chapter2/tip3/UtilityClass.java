package chapter2.tip3;

/**
 * Created by snakecc on 14-3-17.
 * 通过私有构造函数强化不可实例化的能力
 * 假设这个类不想被实例化
 */
public class UtilityClass {

    private UtilityClass(){
        //这样就可以了。。
    }

    //....一些public static 方法
}
