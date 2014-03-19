package chapter6.tip26;

import java.util.*;

/**
 * Created by snakecc on 14-3-19.
 *
 * 小心使用重载
 * 对于重载方法的选择是静态的，而对于被改写方法的选择是动态的，是根据运行时决定的
 *
 * 尽量别整出2个具有相同参数数目的重载方法，可以的话就改个方法名字
 *
 * 构造函数的话可以试着用工厂方法
 *
 * 非得重载的话就要保证：当传递同样参数时，所有的重载方法行为一致！
 */
public class CollectionClassifier {
    public static String Classify(Set s){
        return "set";
    }
    public static String Classify(List l){
        return "list";
    }
    public static String Classify(Collection c){
        return "unknown Collection";
    }

    public static void main(String [] args){
        Collection[] tests = new Collection[]{
                new HashSet(),
                new ArrayList(),
                new HashMap().values()
        };
        //会打三遍unknown Collection
        for(int i = 0;i<tests.length;i++){
            System.out.println(tests[i].getClass());
            System.out.println(Classify(tests[i]));
        }
    }
}
