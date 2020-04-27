package 구조패턴.facade;

public enum Signal {
    ON("On"), OFF("Off");

    private String state;

    Signal(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
