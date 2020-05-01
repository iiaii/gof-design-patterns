package 행동패턴.strategy;

public class Atom extends Robot {
    public Atom(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        super(name, movingStrategy, attackStrategy);
    }
}
