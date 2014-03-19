/**
 * Created by snakecc on 14-3-19.
 *
 * 对于可恢复的条件使用被检查的异常，对于程序错误使用运行时异常；
 * 三种可抛出结构：
 *      1、被检查的异常:checked exception
 *      2、运行时异常: runtime exception
 *      3、error
 * 如果希望使用者能恢复，那就是checked exception 提供一些可恢复的方法。
 * 未被检查的异常一般都是runtime exception
 * */
package chapter8.tip40;