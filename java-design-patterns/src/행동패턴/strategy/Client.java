package 행동패턴.strategy;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("태권브이", Walking.STRATEGY, Punch.STRATEGY);
        Robot atom = new Atom("아톰", Flying.STRATEGY, Missile.STRATEGY);

        taekwonV.attack();
        taekwonV.move();
        atom.attack();
        atom.move();
    }
}
