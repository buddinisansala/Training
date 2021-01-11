package task1;

public class CustomerRegistration {
    public static void main(String []args) {

        try{
            nameValidation();           
        } catch(EmptyStringException exception){    

            exception.printStackTrace();
        }
    }
    
    public static void nameValidation() throws EmptyStringException{
        try {
        	emailValidation();
        }catch(InvalidFormatException exception) {
            throw new EmptyStringException("Name required",exception);
        }

    }
    
    public static void emailValidation() throws InvalidFormatException {
        try {
        	phoneNumberValidation();
        } catch (IllegalFormatException exception) {
            throw new InvalidFormatException("Email format Invalid",exception);
        }
    }
    
    public static void phoneNumberValidation() throws IllegalFormatException {
        try {
        	selectCategory();
        } catch (EmptyInputException exception){
        throw new IllegalFormatException("Telephone number length not valid",exception);
        }
    }
    
    public static void selectCategory() throws EmptyInputException{
       throw new EmptyInputException("At least one category required");
    }

}



