package task2;

class InvalidPasswordException extends RuntimeException {

	InvalidPasswordException(String password) {
        super(password);
    }
}

public class UncheckedException {

    static void InvalidPassword(String password) throws InvalidPasswordException {
    	//for get a strong password
        if (password.length() >= 8) {
            System.out.println("Password successfully added");
        } else {
            throw new InvalidPasswordException("Invalid password!");
        }
    }

    public static void main(String[] args) {
       
        try {
        	InvalidPassword("bns");
        } catch (InvalidPasswordException exception) {
            exception.printStackTrace();
        }
    }
}