package Exceptions_HW3;

public class WrongInputValueException extends Exception{
    String valueName;
    public  WrongInputValueException(String valueName) {
        this.valueName = valueName;
    }

    @Override
    public String getMessage() {
        return "The entered " + valueName + " is wrong";
    }
}
