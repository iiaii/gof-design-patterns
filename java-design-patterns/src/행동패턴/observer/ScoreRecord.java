package 행동패턴.observer;

import java.util.LinkedList;
import java.util.List;

public class ScoreRecord extends Subject {
    private List<Integer> scores = new LinkedList<>();

    public void addScore(int score) {
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScores() {
        return new LinkedList<>(scores);
    }
}
