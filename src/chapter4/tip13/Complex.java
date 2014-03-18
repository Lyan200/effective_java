package chapter4.tip13;

/**
 * Created by snakecc on 14-3-18.
 * 支持非可变性，
 * 1、所有域都是final的
 * 2、都是私有的
 * 3、无任何修改对象的方法
 * 4、无可被子类改写的方法
 * 5、对于任何可变组件的互斥访问
 */
public class Complex {
    private final float re;
    private final float im;

    public Complex(float re,float im){
        this.re = re ;
        this.im = im;
    }

    public Complex add(Complex complex){
         return new Complex(re+complex.re,im+complex.im);
    }

    public Complex sub(Complex c){
        return new Complex(re -c.re ,im - c.im);
    }

    @Override
    public boolean equals(Object o){
        if( o == this){
            return true;
        }
        if(!(o instanceof Complex)){
            return false;
        }
        Complex c = (Complex) o;
        return ((Float.floatToIntBits(re) == Float.floatToIntBits(c.re))&&(Float.floatToIntBits(im) == Float.floatToIntBits(c.im)));
    }
    @Override
    public int hashCode(){
        int result = 17 + Float.floatToIntBits(re);
        result = 37*result + Float.floatToIntBits(im);
        return result ;
    }

    public String toString(){
        return ("("+ re + "+"+ im+"i");
    }


    //这个东西好啊，可以不用考虑线程安全问题
    public static void main(String[] args){
        final Complex ZERO = new Complex(0,0);
        Complex ONE = new Complex(1,0);
        Complex I = new Complex(0,1);
    }
}
