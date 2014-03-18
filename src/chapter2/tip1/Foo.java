package chapter2.tip1;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by snakecc on 14-3-17.
 * 静态工厂方法有3个好处：
 * 1、有名字；
 * 2、不用new；
 * 3、可以返回子类；
 * 坏处：
 * 1、类如果不含公有的活着受保护的构造函数，就不能被子类化
 * 2、看不出这个是构造函数。。
 */

public class Foo {
    private static Map implementations = null;

    private static synchronized void initMapIfNessary(){
        if(implementations == null){
            implementations = new HashMap();

        }
    }

    public static Foo getInstance(String key){
        initMapIfNessary();
        Class c = (Class) implementations.get(key);
        if(c == null){
            return new DefaultFoo();
        }
        //if 条件可以加入有构造条件的函数
        try{

            if(key.equals(1)){
                Class cl = Class.forName("DefaultFoo");
                Constructor c0 = cl.getDeclaredConstructor();
                c0.setAccessible(true);
                DefaultFoo a0 =(DefaultFoo) c0.newInstance();
                return a0;
            }
            return (Foo) c.newInstance();
        }catch(Exception e){
            return new DefaultFoo();
        }
    }

    private static class DefaultFoo extends Foo {

    }

}
