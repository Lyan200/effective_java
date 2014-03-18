package chapter3.tip8;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by snakecc on 14-3-17.
 * hashCode方法必须要喝equals方法结果一致。
 */
public class PhoneNumber {
    private final short areaCode;
    private final short exchange;

    public PhoneNumber(int areaCode,int exchange){
        try {
            rangeCheck(areaCode,999,"area code");
            rangeCheck(exchange,999,"exchange");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        this.areaCode = (short) areaCode;
        this.exchange = (short) exchange;
    }

    private static void rangeCheck(int arg,int max ,String name) throws IllegalAccessException {
        if(arg <0||arg >max){
            throw new IllegalAccessException(name +":"
            +arg);
        }
    }

    @Override
    public boolean equals(Object o){
        if (o==this){
            return true;
        }
        if(!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.exchange ==exchange &&
                pn.areaCode == areaCode;
    }

    /**
     * Volatile修饰的成员变量在每次被线程访问时，都强迫从共享内存中重读该成员变量的值。而且，当成员变量发生变化时，强迫线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。

     Java语言规范中指出：为了获得最佳速度，允许线程保存共享成员变量的私有拷贝，而且只当线程进入或者离开同步代码块时才与共享成员变量的原始值对比。

     这样当多个线程同时与某个对象交互时，就必须要注意到要让线程及时的得到共享成员变量的变化。

     而volatile关键字就是提示VM：对于这个成员变量不能保存它的私有拷贝，而应直接与共享成员变量交互。

     使用建议：在两个或者更多的线程访问的成员变量上使用volatile。当要访问的变量已在synchronized代码块中，或者为常量时，不必使用。

     由于使用volatile屏蔽掉了VM中必要的代码优化，所以在效率上比较低，因此一定在必要时才使用此关键字。
     * @return
     */
    private volatile int hashCode = 0;

    /**
     * public int hashCode(){
     *      blabla的调用下面的hashCode值
     *     return hashCode;
     * }
     */

    //一定要有hashCode 不然不能放到集合中
    @Override
    public int hashCode(){
//        return 54; //这样会把散列表变成线性表的
        /**
         * 通常这样算散列
         * 先存一个非零整数 如 result = 17
         * boolean (f?0:1)
         * byte/char/short/int (int)f
         * long (int)(f^(f>>>32))
         * float  Float.floatToTintBits(f)
         * double Double.doubleToLongBits(f) 然后 执行long类型的
         * Object/array 则递归调用 没个非冗余域的hashCode，并将结果组合起来 result = 37*result +c; c是上面步骤中得到的散列值
         */
        int result = 17;
        int primeNumber = 37; //一般选个奇素数
        result = primeNumber * result + areaCode;
        result = primeNumber * result + exchange;
        return result;
    }

    public static void main(String[] args){
        Map map = new HashMap();
        map.put(new PhoneNumber(500,290),"lucifer");
        System.out.println(map.get(new PhoneNumber(500,290)));
        System.out.println(new PhoneNumber(500,290).hashCode());
        //如果没有hashCode方法的话用map.get(new PhoneNUmber(500,290))将得不到"lucifer";
    }
}
