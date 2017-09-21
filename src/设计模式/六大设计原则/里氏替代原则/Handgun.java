package 设计模式.六大设计原则.里氏替代原则;

/**
 * 手枪
 * Created by min on 2017/5/29.
 */
public class Handgun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
