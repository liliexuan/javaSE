package com.java8.lambda;

/**
 * @Author Min
 * @Description:
 * @ClassName: com.java8.lambda.DemoLambda
 * @Date 14:17 - 2018/2/28.
 */
public class DemoLambda {

    public static void main(String[] args) {
        Object o = FunctionInterface.doSomething(10, (Integer a) -> a);
        System.out.println(o);
    }
}
