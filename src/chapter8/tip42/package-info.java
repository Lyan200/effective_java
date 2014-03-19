/**
 * 尽量使用标准的异常
 *
 * 提高程序的重用性。
 *
 * 最常用的3个异常：
 * 0、NullPointerException
 * 1、IllegalArgumentException
 * 2、IllegalStateException
 *
 * 应该通晓的异常：
 * ConcurrentModificationException
 * 如果一个被设计为单线程的对象，检测到自己被并发的修改，就该被抛出这异常。
 *
 * UnsupportedOperationException
 * Created by snakecc on 14-3-19.
 */
package chapter8.tip42;