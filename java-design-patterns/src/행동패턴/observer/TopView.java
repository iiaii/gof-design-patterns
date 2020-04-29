package 행동패턴.observer;

import java.util.Collections;
import java.util.List;

public class TopView implements Observer {
    private ScoreRecord scoreRecord;
    private int limit;

    public TopView(ScoreRecord scoreRecord, int limit) {
        this.scoreRecord = scoreRecord;
        this.limit = limit;
    }

    @Override
    public void update() {
         display(scoreRecord.getScores());
    }

    public void display(List<Integer> scores) {
        scores.sort(Collections.reverseOrder());
        System.out.println("[ Top " + limit + " ]");
        for (int i = 0; i < Math.min(limit, scores.size()) ; i++) {
            System.out.println((i+1)+". "+scores.get(i));
        }
    }
}
