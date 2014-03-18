package chapter4.tip17;

/**
 * Created by snakecc on 14-3-18.
 *
 * 常量应该用类来实现，而不是接口 ，接口代表了一种承诺
 */
public class PhysicalContants {
    private PhysicalContants(){};//禁止实例化

    public static final double  AVOGADROS_NUMBER = 6.02;
    public static final double BOLTZMANN_CONSTANT = 1.38;
//    public static final ...blablabla...
}
