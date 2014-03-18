package chapter2.tip2;

/**
 * Created by snakecc on 14-3-17.
 * singleton with final field
 */
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){
        //....initialize
    }
    //....
}
