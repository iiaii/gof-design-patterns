package 구조패턴.flyweight;

import java.util.HashMap;
import java.util.Random;

public enum PageFactory {
    FACTORY;

    private HashMap<String, Page> pages = new HashMap<>();
    private Random random = new Random(10);

    public Page getRandomPage() {
        return new RandomPage(random.nextInt());
    }

    public Page getCustomPage(String id) {
        if(!pages.containsKey(id)) {
            pages.put(id, new CustomPage(id));
        }
        return pages.get(id);
    }
}
