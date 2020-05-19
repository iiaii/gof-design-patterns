package 구조패턴.flyweight;

import java.util.HashMap;
import java.util.Random;

public enum PageFactory {
    FACTORY;

    private HashMap<String, Page> pages = new HashMap<>();
    private Random random = new Random();

    public Page getRandomPage() {
        return new RandomPage(random.nextInt(20));
    }

    public Page getCustomPage(String id) {
        if(!pages.containsKey(id)) {
            pages.put(id, new CustomPage(id));
        }
        return pages.get(id);
    }
}
