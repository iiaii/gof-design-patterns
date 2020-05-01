package 행동패턴.strategy;

public abstract class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public Robot(String name, MovingStrategy movingStrategy, AttackStrategy attackStrategy) {
        this.name = name;
        this.movingStrategy = movingStrategy;
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void move() {
        System.out.print(name +" : ");
        movingStrategy.move();
    }
    public void attack() {
        System.out.print(name +" : ");
        attackStrategy.attack();
    }
}
