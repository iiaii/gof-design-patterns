package 행동패턴.chain_of_responsibility;

public class StdoutLogger extends Logger {
    public StdoutLogger(int errNum) {
        super(errNum, "Stdout");
    }

    @Override
    protected boolean process(Error error) {
        if(this.getErrNum() == error.getErrNum()) {
            System.out.println(error.toString() + this);
            return true;
        }
        return false;
    }
}
