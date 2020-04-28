package 행동패턴.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        Error error1 = new Error(1);
        Error error2 = new Error(2);

        Logger logger = new StdoutLogger(1);
        logger.setNext(new StdinLogger(2));

        logger.log(error1);
        logger.log(error2);
        logger.log(error2);
    }
}
