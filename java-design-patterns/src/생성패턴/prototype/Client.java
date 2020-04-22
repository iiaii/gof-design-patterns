package 생성패턴.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RollBook rollBook = new RollBook();
        rollBook.addStudent("kim");
        rollBook.addStudent("jay");
        rollBook.addStudent("bibi");

        rollBook.callTheRoll();

        RollBook backupRollBook = (RollBook)rollBook.clone();

        backupRollBook.callTheRoll();
    }
}
