package 设计模式.六大设计原则.里氏替代原则;

/**
 * 机枪
 * Created by min on 2017/5/29.
 */
public class MachineGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("机枪射击...");
    }
}
