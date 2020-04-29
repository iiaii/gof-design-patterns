package 행동패턴.observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        display(scoreRecord.getScores());
    }

    public void display(List<Integer> scores) {
        System.out.println("최고 점수 : "+Collections.max(scores));
        System.out.println("최저 점수 : "+Collections.min(scores));
    }
}
