package chapter4.tip14;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by snakecc on 14-3-18.
 * 复合优先于继承
 *
 */
public class InstrumentedHashSet extends HashSet {
    private int addCount =0;
    public InstrumentedHashSet(){

    }
    public InstrumentedHashSet(Collection c){
        super(c);
    }

    @Override
    public boolean add(Object o){
        addCount++;
        return super.add(0);
    }

    /**
//     * 这个方法是基于add方法实现的。每次都会调用add，所以会导致错误。
//     * @param c
//     * @return
//     */
//    @Override
//    public boolean addAll(Collection c){
//        addCount+=c.size();
//        return super.addAll(c);
//    }

    public int getAddCount(){
        return addCount;
    }

}
