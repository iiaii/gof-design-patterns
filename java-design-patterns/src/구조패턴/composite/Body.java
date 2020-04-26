package 구조패턴.composite;

public class Body extends ComputerDevice {
    private int price;
    private int power;

    public Body(int price, int power) {
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
