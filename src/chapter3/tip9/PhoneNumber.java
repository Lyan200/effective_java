package chapter3.tip9;

/**
 * toString 的方法应该包含足够多的信息，而且无二义性
 * Created by snakecc on 14-3-18.
 */
public class PhoneNumber {
    private int areaCode ;
    private int exchange ;
    private int extension;

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", exchange=" + exchange +
                ", extension=" + extension +
                '}';
    }
}
