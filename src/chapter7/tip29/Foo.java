package chapter7.tip29;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by snakecc on 14-3-19.
 *
 * 将局部变量的作用域最小化
 *
 * 1、在第一次使用它的地方声明局部变量
 * 2、几乎每个局部变量声明都应该包含一个初始化表达式
 * 3、能用for 就不要用while
 */
public class Foo {

    public static void main(String[] args){
        List c = new LinkedList();
        for(Iterator i = c.iterator();i.hasNext(); ){
            //do sth..
            i.next();
        }
        for(int i=0, n = expensiveComputaion();i<n;i++){

        }
    }

    private static int expensiveComputaion() {
        return 100;
    }

}
