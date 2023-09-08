package Exceptions_HW3;

public class Product {
    //private int id;
    private String name;
    private int availableQuantity;
    private double price;

    public Product( String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int quantityAfterPurchase) throws StockShortageException{
        if (quantityAfterPurchase < 0){
            throw new StockShortageException(this);
        }
        this.availableQuantity = quantityAfterPurchase;
    }
    public void setAvailableQuantityToZero() {
        // продать все оставшиеся единицы данного товара
        this.availableQuantity = 0;
    }
    public void restoreAvailableQuantity(int quantity){

        this.availableQuantity = quantity;
    }

    public double getPrice() {
        return price;
    }
}
