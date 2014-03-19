package chapter4.tip18;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by snakecc on 14-3-18.
 */
public class Myset extends AbstractSet {
    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    //典型的非静态内部类，
    //如果成员类不要求访问外部实例，那么久请加上static
    //static
    private class MyIterator implements Iterator{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
        //...
    }

    //典型的匿名内部类
    private void sort(Object[] args){
        Arrays.sort(args,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() -((String)o2).length();
            }
        });
    }
}
