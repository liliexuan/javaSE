package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Min
 * @Description:
 * @ClassName: com.java8.lambda.TestTask
 * @Date 10:19 - 2018/3/2.
 */
public class TestTask {

    public static void doSomeThing(Runnable r){
        r.run();
    }

    public static void doSomeThing(Task t){
        t.execute();
    }

    public static void doSomeThing(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        doSomeThing((Task) () -> {
            System.out.println("hello world!");
        });
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(TestTask::doSomeThing);
    }
}
