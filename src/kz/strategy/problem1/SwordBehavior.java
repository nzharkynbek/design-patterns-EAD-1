package kz.strategy.problem1;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
