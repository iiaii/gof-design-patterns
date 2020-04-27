package 구조패턴.facade;

public class Monitor {
    public void controlMonitor(Signal signal) {
        if(signal == Signal.ON) {
            System.out.println("모니터를 켭니다");
        } else {
            System.out.println("모니터를 끕니다");
        }
    }
}
