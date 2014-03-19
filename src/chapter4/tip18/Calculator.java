package chapter4.tip18;

/**
 * Created by snakecc on 14-3-18.
 * 看不懂啊啊啊啊啊
 */
public class Calculator {
    public static abstract class Operation{
        private final String name ;
        Operation(String name){this.name = name;}

        public String toString(){ return this.name;}

        abstract double eval(double x,double y);

        public static final Operation PLUS = new Operation("+"){
            double eval(double x, double y){return x+y;}
        };
        public static final Operation MINUS = new Operation("-"){
            double eval(double x ,double y){return x-y;}
        };

    }
    public double calculate(double x,Operation op,double y){
        return op.eval(x,y);
    }

    public static void main(String[] s){
        Calculator calculator = new Calculator();
        calculator.calculate(22,Operation.MINUS,40);
    }
}
