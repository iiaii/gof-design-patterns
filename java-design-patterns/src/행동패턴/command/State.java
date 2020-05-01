package 행동패턴.command;

public interface State {
    void onClick(Device device);
    void offClick(Device device);
}
