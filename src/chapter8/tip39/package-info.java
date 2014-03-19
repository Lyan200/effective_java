/**
 * 只针对不正确的条件才使用异常
 * 1、一唱歌只应该用于不正常的条件，而不是用在正常的控制流；
 * 2、
 *
 * Created by snakecc on 14-3-19.
 */
package chapter8.tip39;

class Foo{
    public static void main(String[] args){
        try{
            int i = 0;
            //while(true)
            //    a[i++].fn();
        }catch(ArrayIndexOutOfBoundsException aiob){

        }
    }
}