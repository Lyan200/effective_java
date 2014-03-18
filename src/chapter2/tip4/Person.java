package chapter2.tip4;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by snakecc on 14-3-17.
 * 用静态块来避免不必要的浪费,
 * 轻量级的对象就可以反复创建，重量级的尽量重用
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate){
        this.birthDate = birthDate;
    }

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(BOOM_START)>=0 && birthDate.compareTo(BOOM_END)<0;
    }
}
