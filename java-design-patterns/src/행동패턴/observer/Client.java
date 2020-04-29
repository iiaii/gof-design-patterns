package 행동패턴.observer;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        TopView topView5 = new TopView(scoreRecord, 5);
        TopView topView10 = new TopView(scoreRecord, 10);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(topView5);
        scoreRecord.attach(topView10);
        scoreRecord.attach(minMaxView);

        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            scoreRecord.addScore(random.nextInt(100));
        }

        scoreRecord.detach(topView5);
        AverageView averageView = new AverageView(scoreRecord);
        scoreRecord.attach(averageView);

        for (int i = 0; i < 10 ; i++) {
            scoreRecord.addScore(random.nextInt(100));
        }
    }
}
