package 구조패턴.bridge;

public class Client {
    public static void main(String[] args) {
        Animal lion = new Lion(HuntingAtGround.getMethod());
        Animal eagle = new Eagle(HuntingAtWater.getMethod());

        lion.hunt();
        System.out.println();
        eagle.hunt();
    }
}
