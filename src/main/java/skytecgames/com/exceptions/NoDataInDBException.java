package skytecgames.com.exceptions;

public class NoDataInDBException extends RuntimeException{

    public NoDataInDBException() {
        super("No such data in DB");
    }
}
