package Exceptions_HW2_Task3;

public class NumberSumException extends Exception{
    @Override
    public String getMessage() {
        return ("Сумма первого и второго чисел слишком мала");
    }
}
