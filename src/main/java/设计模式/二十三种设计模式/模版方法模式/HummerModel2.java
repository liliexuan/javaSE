package 设计模式.二十三种设计模式.模版方法模式;

/**
 * Created by min on 2017/6/7.
 */
public class HummerModel2 extends HummerModel{

    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
