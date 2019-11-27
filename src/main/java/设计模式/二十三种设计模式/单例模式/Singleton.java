package 设计模式.二十三种设计模式.单例模式;

/**
 * Created by min on 2017/6/5.
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){}

    //通过该方法获得实例对象
    public static Singleton getSingleton(){
        return singleton;
    }

    public static void doSomething(){
        System.out.println("do something...");
    }
}
