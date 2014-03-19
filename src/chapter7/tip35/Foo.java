package chapter7.tip35;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by snakecc on 14-3-19.
 * 接口优先于反射机制 reflection facility  java.lang.reflect通过程序访问已装载的类想信息
 * 包括类的尘缘名字、域类型、方法原型等
 *
 * 用反射创建实例，然后通过他们的接口或超类，以正常访问
 */
public class Foo {
    public static void main(String[] args){
        Class cl = null;
        try{
            cl = Class.forName(args[0]);
        }catch(ClassNotFoundException e){
            System.err.println("Class not found.");
            System.exit(1);
        }
        //实例化类
        Set s = null;
        try{
            s = (Set) cl.newInstance();
        }catch(IllegalAccessException e){
            System.err.println("Class not accessible.");
        }catch(InstantiationException e){
            System.err.println("Class not instantiable.");
            System.exit(1);
        }

        s.addAll(Arrays.asList(args).subList(1,args.length));
        System.out.println(s);
    }
}
