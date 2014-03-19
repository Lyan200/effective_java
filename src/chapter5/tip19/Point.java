package chapter5.tip19;

/**
 * Created by snakecc on 14-3-18.
 * 用类代替结构
 *
 * 公共类不应该直接暴露数据域
 */
public class Point {
    private float x;
    private float y;

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {

        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
}
