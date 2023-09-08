package Exceptions_HW3;
public class ShopManager {
    public static boolean purchaseProduct(int productId, int requestedQuantity, int clientId) throws OutOfStockException, WrongInputValueException {
        int quantityToPurchase = requestedQuantity;
        if (requestedQuantity <= 0){
            throw new WrongInputValueException("quantity");
        }
        Product product;
        try {
            product = ProductDatabase.getProduct(productId);

        } catch (IllegibleItemException e) {
            System.out.println("Товар " + e.getMessage());
            return false;
        }
        try {
            if (product.getAvailableQuantity() == 0) {
                throw new OutOfStockException(product);
            }
            product.setAvailableQuantity(product.getAvailableQuantity() - requestedQuantity);
        }  catch (StockShortageException e) {
            System.out.println(e.getMessage());
            // продаём столько товара, сколько есть в наличии
            quantityToPurchase = product.getAvailableQuantity();
            product.setAvailableQuantityToZero();
        }
        double totalPrice = product.getPrice() * quantityToPurchase;
        System.out.println("Receipt. Product: " + product.getName() + ", price: " + product.getPrice() + ", quantity: " + quantityToPurchase);
        System.out.println("Total price: $" + totalPrice);
        try {
            ClientManager.performTransaction(clientId, totalPrice);
            return true;
        } catch (IllegibleItemException e) {
            System.out.println("Клиент " + e.getMessage());
            return false;
        }  catch (InsufficientFundsException e) {
            try {
                // новое исключене поволяется вывести в консоль не только клиента, у которого недостаточно денег,
                // но и товар, при попытке купить который возникла InsufficientFundsException и кол-во товара
                throw new InsufficientFundsForPurchaseException(e.getClient(), productId, quantityToPurchase);
            } catch (InsufficientFundsForPurchaseException ex) {
                System.out.println(ex.getMessage());
                product.restoreAvailableQuantity(product.getAvailableQuantity() + requestedQuantity);
                return false;
            }
        }
    }
}
