package 设计模式.六大设计原则.里氏替代原则;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by min on 2017/5/29.
 */
public class Father {

    public Collection doSomething(HashMap map){
        System.out.println("父类被执行了...");
        return map.values();
    }
}



class Son extends Father{
    public Collection doSomething(Map map){
        System.out.println("子类被执行了...");
        return map.values();
    }
}


class ClientTest{

    public static void invokerFather(){
        Father f = new Father();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void invokerSon(){
        Son f = new Son();
        Map map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        invokerFather();
        invokerSon();
    }
}