package 생성패턴.singleton;

public enum EnumPrinter implements Printer {
    printer;
    private int counter = 0;

    public static Printer getPrinter() {
        return printer;
    }

    @Override
    public void print(String str) {
        System.out.println(str+" : "+(++counter));
    }
}
