package Exceptions_HW3;

public class OutOfStockException extends Exception {
    Product product;


    public OutOfStockException(Product product) {
        this.product = product;
    }

    @Override
    public String getMessage() {
        return "Товар " + product.getName() + "отсутствует на складе";
    }
}
