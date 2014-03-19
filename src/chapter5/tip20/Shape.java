package chapter5.tip20;

/**
 * Created by snakecc on 14-3-18.
 * 用累的层次来代替联合union,大概是自定义枚举类型吧
 */
public abstract class Shape {
    abstract double area();
}

class Circle extends Shape{
    final double radius;
    Circle(double radius){this.radius = radius;}
    double area(){return Math.PI * radius*radius; }
}

class Rectangle extends Shape{
    final double length;
    final double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length*width;
    }

}

class Square extends Rectangle{
    Square(double side){
        super(side,side);
    }
    double side(){
        return length;
    }
}



