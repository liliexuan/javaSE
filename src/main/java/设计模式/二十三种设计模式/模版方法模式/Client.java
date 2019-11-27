package 设计模式.二十三种设计模式.模版方法模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by min on 2017/6/7.
 */
public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("--------------H1型号悍马----------------");
        System.out.println("H1型号的悍马是否需要喇叭响？0-不需要，1-需要");
        String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HummerModel1 h1 = new HummerModel1();
        if("0".equals(type)){
            h1.setAlarm(false);
        }
        h1.run();
        System.out.println("---------------H2型号悍马-----------------");
        HummerModel2 h2 = new HummerModel2();
        h2.run();
    }
}
