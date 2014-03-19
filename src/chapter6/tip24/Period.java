package chapter6.tip24;

import java.util.Date;

/**
 * Created by snakecc on 14-3-19.
 * 必要时要设计保护性拷贝
 */
public class Period {
    private final Date start ;
    private final Date end;

    public Period(Date start,Date end){
        this.start = new Date(start.getTime());//保护性拷贝
        this.end = new Date(end.getTime());
        if(start.compareTo(end)>0){
            throw new IllegalArgumentException("时间不对");
        }
    }

    public Date getStart() {
        return (Date)start.clone();
    }

    //这里就防止时间被变更
    public Date getEnd() {
        return (Date)end.clone();
    }

    public static void main(String[] args){
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start,end);
        p.getEnd().setYear(90);// 由于保护性的拷贝，这样就不可能被简单攻击了，此处的方法就无效了
    }
}
