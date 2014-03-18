package chapter2.tip5;

import java.util.EmptyStackException;

/**
 * Created by snakecc on 14-3-17.
 * 避免类存泄露 ，清除过期的对象引用
 * 重点小心缓存这个东西
 */
public class Stack {
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
}
