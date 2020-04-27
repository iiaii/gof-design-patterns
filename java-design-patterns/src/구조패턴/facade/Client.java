package 구조패턴.facade;

public class Client {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.controlTv(Signal.ON);
        System.out.println("---------");
        tv.controlTv(Signal.OFF);
    }
}
