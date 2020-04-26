package 구조패턴.composite;

public class Monitor extends ComputerDevice {
    private int price;
    private int power;

    public Monitor(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
