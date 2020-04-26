package 구조패턴.composite;

public class Client {
    public static void main(String[] args) {
        Computer myComputer = new Computer();

        myComputer.addDevice(new Mouse(30000,50));
        myComputer.addDevice(new KeyBoard(50000,50));
        myComputer.addDevice(new Monitor(150000,170));
        myComputer.addDevice(new Body(1500000,300));

        System.out.println("컴퓨터 비용 : "+myComputer.getPrice()+"원");
        System.out.println("컴퓨터 소비전력 : "+myComputer.getPower()+"W");
    }
}
