package Exceptions_HW3;

public class IllegibleItemException extends Exception{
    //Product product;

    public IllegibleItemException(){

    }

    @Override
    public String getMessage() {
        return " с таким ID не найден";
    }

    @Override
    public String toString() {
        return "Товар не найден";
    }
}
