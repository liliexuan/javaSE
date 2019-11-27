package 设计模式.六大设计原则.里氏替代原则;

/**
 * 步枪
 * Created by min on 2017/5/29.
 */
public class Rifle extends AbstractGun{

    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
