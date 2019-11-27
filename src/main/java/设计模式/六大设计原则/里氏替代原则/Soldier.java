package 设计模式.六大设计原则.里氏替代原则;

/**
 * Created by min on 2017/5/29.
 */
public class Soldier {

    private AbstractGun gun;


    public void setGun(AbstractGun gun){
        this.gun=gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
