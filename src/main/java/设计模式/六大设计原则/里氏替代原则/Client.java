package 设计模式.六大设计原则.里氏替代原则;

/**
 * Created by min on 2017/5/29.
 */
public class Client {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new Handgun());
        soldier.killEnemy();
    }
}
