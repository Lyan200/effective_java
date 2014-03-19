package chapter7.tip31;

import java.math.BigDecimal;

/**
 * Created by snakecc on 14-3-19.
 * 不要用float或double来表达精确计算的结果,表示10的任何负次方是不可能的
 */
public class foo {

    private static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        print("++++++++++++++++这里是反例+++++++++++++++\n");
        System.out.println(1.03 - .42);//这个是不对的，用浮点数来表示这个太难，浮点大概是0左右的正态分布，越中间越密集

        /**
         * 这个又是一个反例。不能这么玩啊少年！
         */
        double funds = 1.00;
        int itemsBought = 0;
        for(double price =0.10;funds>=price;price +=.10){
            funds -=price;
            itemsBought++;
        } 
        System.out.println(itemsBought + "items bought.");
        System.out.println("change: $"+ funds);

        print("++++++++++++++++这里是正确的+++++++++++++++\n");

        final BigDecimal TEN_CENTS = new BigDecimal("0.10");

        itemsBought = 0;
        BigDecimal funds2 = new BigDecimal("1.00");
        for(BigDecimal price = TEN_CENTS;
                funds2.compareTo(price)>=0;
                price = price.add(TEN_CENTS)){
            itemsBought++;
            funds2 = funds2.subtract(price);
        }
        print(itemsBought + "items bought.");
        print("Money left over:$ "+ funds2);
    }
}
