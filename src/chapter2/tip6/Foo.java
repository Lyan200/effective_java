package chapter2.tip6;

/**
 * Created by snakecc on 14-3-17.
 * finalizer finalizer 一个try finally 不应该被首先考虑而是要被显式的声明
 */
public class Foo {

    static {
         Foo foo = new Foo();
        try{

                //do sth must be done
        }finally{
            try {
                foo.terminate();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
    //这哥们放这里是防止你忘了的，虽然不能及时被调用到
    //还有一个用处是在本地对等体native peer 有关 ，因为这东西回收函数gc不知道怎么回收它native method

    private void terminate() throws Throwable {
        super.finalize();//终结者链不会被执行,必须手动调用，这个是继承后的
    }
}
