package chapter5.tip22;

/**
 * Created by snakecc on 14-3-18.
 * 用类和接口代替指针
 */
public class StringLengthComparator {
    private StringLengthComparator(){};

    public static final StringLengthComparator INSTANCE = new StringLengthComparator();

    public int compare(String s1,String s2){
        return s1.length() - s2.length();
    }
}
