package Exceptions_HW2_Task3;

public class NumberOutOfRangeException extends Exception{
    @Override
    public String getMessage() {
        return ("число вне допустимого диапазона");
    }
}
