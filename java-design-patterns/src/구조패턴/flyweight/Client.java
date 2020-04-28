package 구조패턴.flyweight;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static List<Page> pages = new LinkedList<>();
    public static void main(String[] args) {
        PageFactory pageFactory = PageFactory.FACTORY;

        pages.add(pageFactory.getCustomPage("iiaii"));
        pages.add(pageFactory.getCustomPage("iiaii"));
        pages.add(pageFactory.getRandomPage());
        pages.add(pageFactory.getRandomPage());
        pages.add(pageFactory.getRandomPage());
        System.out.println("------------------");
        showPages();
    }

    public static void showPages() {
        pages.forEach(Page::showPage);
    }
}
