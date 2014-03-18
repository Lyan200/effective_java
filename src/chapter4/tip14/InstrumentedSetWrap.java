package chapter4.tip14;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by snakecc on 14-3-18.
 * 这个类不继承，而是改用聚合的方式,这是个包装类，几乎没啥缺点，唯一的问题是不能用在回调函数上
 *
 * 只有在子类真正是超类的子类型时才继承，否则就聚合
 * is-a or has-a
 */
public class InstrumentedSetWrap implements Set {

    private final Set s;

    private int addCount = 0;

    public InstrumentedSetWrap(Set s){
        this.s = s;
    }

    @Override
    public boolean add(Object o){
        addCount++;
        return s.add(o);
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return s.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        addCount+=c.size();
        return s.addAll(c);
    }

    @Override
    public void clear() {
        s.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return s.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return s.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return s.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return s.toArray(a);
    }
}
