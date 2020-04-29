package 행동패턴.observer;

import java.util.List;

public class AverageView implements Observer {
    private ScoreRecord scoreRecord;

    public AverageView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        display(scoreRecord.getScores());
    }

    public void display(List<Integer> scores) {
        int avg = scores.stream().reduce(Integer::sum).orElseThrow()/scores.size();
        System.out.println("평균 : "+avg);
    }
}
