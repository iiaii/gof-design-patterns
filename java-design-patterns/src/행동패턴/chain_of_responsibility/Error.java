package 행동패턴.chain_of_responsibility;

public class Error {
    private int errNum;

    public Error(int errNum) {
        this.errNum = errNum;
    }

    public int getErrNum() {
        return errNum;
    }

    @Override
    public String toString() {
        return "[ Error " + errNum + " ]";
    }
}
