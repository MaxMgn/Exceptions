package Exceptions_HW2_Task2;

public class DivisionByZeroException extends Exception{
    @Override
    public String getMessage() {
        return ("Деление на ноль недопустимо");
    }
}
