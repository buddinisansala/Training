package task1;

public class InvalidFormatException extends Exception{
    public InvalidFormatException(String message,Exception exception){

        super(message,exception);
    }
}