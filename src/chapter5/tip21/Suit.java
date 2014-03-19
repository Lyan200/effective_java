package chapter5.tip21;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by snakecc on 14-3-18.
 * 用类来代替枚举类型enum
 */
public class Suit implements Comparable,Serializable{
    private final String name;

    private static int nextOrdinal = 0;//比大小的

    private final int ordinal = nextOrdinal++;

    private Suit(String name){ this.name = name;}

    public String toString(){ return name;}

    public int compareTo(Object o){
        if(!(o instanceof Suit)){
            throw new UnsupportedOperationException();
        }
        return ordinal - ((Suit)o).ordinal;
    }

    public static final Suit CLUBS = new Suit("clubs");
    public static final Suit DIAMONDS = new Suit("diamonds");
    public static final Suit HEARTS = new Suit("hearts");
    public static final Suit SPADES = new Suit("spades");

    private  static final Suit[] PRIVATE_VALUES = {CLUBS,DIAMONDS,HEARTS,SPADES};
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    private Object readResolve() throws ObjectStreamException{
        return PRIVATE_VALUES[ordinal];
    }

    public static void main(String[] args){

    }
}
