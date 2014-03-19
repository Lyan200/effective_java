package chapter7.tip32;

/**
 * Created by snakecc on 14-3-19.
 * 不适合代替能力表(capabilities)，授权,如果key是字符串的话可能被伪造
 */
public class ThreadLocal {
    private ThreadLocal(){};
    public static class Key{
        Key(){};
    }
    public static Key getKey(){
        return new Key();
    }
    public static void set(Key key,Object value){}
    public static Object get(Key key){return null;}
}
