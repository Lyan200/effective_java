package chapter4.tip12;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by snakecc on 14-3-18.
 * 尽可能的降低可访问性，protected也少用，没有修饰的话就是包内私有的
 */
public class Foo {
    //public static final Type[] Values ={};
    //这个东西不能用，会有安全问题,应该改成这样
    private static final Type[] PRIVATE_VALUES = {};
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    //或者用clone方法
    public static final Type[] values(){
        return (Type[]) PRIVATE_VALUES.clone();
    }



}
