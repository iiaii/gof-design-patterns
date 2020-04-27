package 구조패턴.facade;

public class Tv {
    private RemoteReceiver remoteReceiver;
    private Monitor monitor;

    public Tv() {
        this.remoteReceiver = new RemoteReceiver();
        this.monitor = new Monitor();
    }

    public void controlTv(Signal signal) {
        remoteReceiver.receiveSignal(signal);
        monitor.controlMonitor(signal);
    }
}
