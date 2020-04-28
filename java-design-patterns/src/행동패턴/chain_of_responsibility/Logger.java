package 행동패턴.chain_of_responsibility;

public abstract class Logger {
    private int errNum;
    private String errStr;
    private Logger next;

    public Logger(int errNum, String errStr) {
        this.errNum = errNum;
        this.errStr = errStr;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public int getErrNum() {
        return errNum;
    }

    public boolean log(Error error) {
        if(process(error)) {
            return true;
        } else if(next != null) {
            return next.log(error);
        }
        return false;
    }

    protected abstract boolean process(Error error);

    @Override
    public String toString() {
        return " Error name : " + errStr;
    }
}
