package Exceptions_HW3;

import Exceptions_HW3.Product;

public class StockShortageException extends Exception {
    Product product;
    //int quantity;

    public StockShortageException(Product product) {
        this.product = product;
    }

    @Override
    public String getMessage() {
        return "Товара '" + product.getName() + " недостаточно в наличии";
    }
}
