package 행동패턴.chain_of_responsibility;

public class StdinLogger extends Logger {
    public StdinLogger(int errNum) {
        super(errNum, "Stdin");
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
