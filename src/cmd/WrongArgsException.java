package cmd;

public class WrongArgsException extends Exception {
    public WrongArgsException(String message, int numOfArgs) {
        super(message+numOfArgs);
    }
}

