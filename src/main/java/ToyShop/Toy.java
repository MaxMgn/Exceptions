package ToyShop;

public abstract class Toy {
    private int id;
    private String name;
    private static int quantityInStock;

    private static int quantityGiven;
    static int percentage;

    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int getQuantityInStock() {
        return quantityInStock;
    }

    public static void setQuantityInStock(int quantityInStock) throws ToyOutOfStockException{
        if (quantityInStock == 0){
            throw new ToyOutOfStockException ();
        }
        else{
            Toy.quantityInStock = quantityInStock;
        }

    }
    public static int getQuantityGiven() {
        return quantityGiven;
    }

    public static void setQuantityGiven(int quantityGiven) {
        Toy.quantityGiven = quantityGiven;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
