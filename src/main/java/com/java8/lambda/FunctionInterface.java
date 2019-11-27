package com.java8.lambda;

import java.util.function.Function;

/**
 * @Author Min
 * @Description:
 * @ClassName: com.java8.lambda.FunctionInterface
 * @Date 14:46 - 2018/2/28.
 */
public class FunctionInterface {

    public static Object  doSomething(int arg, Function<Integer,Integer> function){
        return function.apply(arg);
    }
}
