package 행동패턴.state;

import java.util.Arrays;

public enum Volume {
    MUTE(0), ONE(1), TWO(2), THREE(3), FOUR(4), MAX(5);

    private int value;

    Volume(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Volume getVolume(int value) {
        for (Volume volume : Volume.values()) {
            if(volume.getValue() == value) {
                return volume;
            }
        }
        return null;
    }
}
