package kz.strategy.problem1;

public class King extends Character {
    public King() {
        weapon = new KnifeBehavior();
    }
    public void fight() {
        System.out.println("King's turn!");
    }
}
