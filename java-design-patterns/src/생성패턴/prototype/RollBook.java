package 생성패턴.prototype;

import java.util.ArrayList;
import java.util.List;

public class RollBook implements Cloneable {
    private List<String> studentList;

    public RollBook() {
        this.studentList = new ArrayList<>();
    }

    public RollBook(List<String> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(String studentName) {
        studentList.add(studentName);
    }

    public void callTheRoll() {
        studentList.forEach(System.out::println);
        System.out.println("--------------------");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        return new RollBook(new ArrayList<>(studentList));
    }
}
