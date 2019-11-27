package 设计模式.二十三种设计模式.模版方法模式;

/**
 * Created by min on 2017/6/7.
 */
public abstract class HummerModel {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run(){
        this.start();
        this.engineBoom();
        if(isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    /**
     * 钩子方法，默认true
     * @return
     */
    protected boolean isAlarm(){
        return true;
    }
}
