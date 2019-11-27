package 设计模式.二十三种设计模式.模版方法模式;

/**
 * Created by min on 2017/6/7.
 */
public class HummerModel1 extends HummerModel{

    private boolean alarmFlag = true;//默认要响喇叭

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarm(boolean isAlarm){
        this.alarmFlag=isAlarm;
    }
}
