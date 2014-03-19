package chapter7.tip34;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Vector;

/**
 * Created by snakecc on 14-3-19.
 * 通过接口引用对象
 * 如果没有合适的接口存在的话，那就用类来引用对象吧。。有合适的基类的话就用基类来引用
 */
public class Foo {
    List subscribers = new Vector();

//    酱紫是不对的！应该优先用接口
//    Vector subscribers = new Vector();

    IdentityHashMap ihm = new IdentityHashMap();
}
