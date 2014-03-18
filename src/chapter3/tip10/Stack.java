package chapter3.tip10;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by snakecc on 14-3-17.
 * 避免类存泄露 ，清除过期的对象引用
 * 重点小心缓存这个东西
 * 这里加上了clone方法,必须实现Cloneable接口，虽然里面么有方法
 */
public class Stack implements Cloneable{
    private Object elements[];
    private int size =0;

    public Stack(int initialCapacity){
        this.elements = new Object[initialCapacity];
    }

    public void push(Object o){
        enSureCapacity();
        elements[size++] = o;
    }

    /**
     * 这个地方可能会导致OME
     * @return
     */
    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        elements[size] = null;//这句很重要！
        return elements[--size];
    }

    private void enSureCapacity(){
        Object[] oldElements = elements;
        if(elements.length == size){
            elements = new Object[2*elements.length +1];
            System.arraycopy(oldElements,0,elements,0,size);
        }
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Stack)){
            throw new UnsupportedOperationException("不能对不同类型比较");
        }
        return Arrays.equals(((Stack) o).elements, elements) && ((Stack) o).size == size;
    }
@Override
    public Object clone() throws CloneNotSupportedException{
        Stack result = (Stack) super.clone();
        result.elements = (Object[])elements.clone();
        return result ;
    }

    public static void main(String[] args){
        Stack s1 = new Stack(20);
        s1.push(new String("dfsafdsaf"));
        try {
            Stack s2 = (Stack)s1.clone();
            System.out.println(s2.equals(s1));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
