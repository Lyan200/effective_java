package chapter3.tip7;

import java.awt.*;

/**
 * Created by snakecc on 14-3-17.
 * 复合优先于继承，当不好用继承来实现的时候，就考虑一下复合,如果改写了equals 方法，并把它们放在同一个集合里面就会出问题。如 Timestamp类和Date类混用
 */
public class ColorPoint {
    private Point point;
    private Color color;

    public ColorPoint(int x,int y, Color color){
        point = new Point(x,y);
        this.color = color;
    }

    public Point asPoint(){
        return point;
    }

    public boolean equals(Object o){
        /*
            用instanceof 来进行非空判断
            用==来加速
            用instanceof来判断类型

         */

        if(!(o instanceof ColorPoint)){
            return false;
        }
        ColorPoint cp = (ColorPoint)o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
