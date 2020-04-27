package 구조패턴.facade;

public class RemoteReceiver {
    public void receiveSignal(Signal signal) {
        System.out.println(signal.getState()+" 신호수신");
    }
}
