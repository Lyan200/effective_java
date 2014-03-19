package chapter6.tip27;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by snakecc on 14-3-19.
 *
 * 返回零长度的数组而不是null
 */
public class Cheese {
    private List cheeseInStock = new LinkedList();

    private final static Cheese[] NULL_CHECK_ARRAY = new Cheese[0];
    //,...blabala add sth in the list

    public Cheese[] getCheese(){
        return (Cheese[])cheeseInStock.toArray(NULL_CHECK_ARRAY);
    }
}
