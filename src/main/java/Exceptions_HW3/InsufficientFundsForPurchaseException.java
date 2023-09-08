package Exceptions_HW3;

public class InsufficientFundsForPurchaseException extends InsufficientFundsException{

    Product product;
    int quantity;

    public InsufficientFundsForPurchaseException(Client client, int productId, int quantity) {
        super(client);
        this.product = ProductDatabase.products.get(productId);
        this.quantity = quantity;
    }

    @Override
    public String getMessage() {
        return "У клиента " + client.getName() + "а не хватает денег для покупки " + quantity +
                " единиц товара " + product.getName();
    }
}
