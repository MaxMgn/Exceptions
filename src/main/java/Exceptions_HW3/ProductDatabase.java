package Exceptions_HW3;

import java.util.ArrayList;

public class ProductDatabase {
    static ArrayList <Product> products;

    public ProductDatabase() {
        products = new ArrayList <Product>();
        products.add(new Product("Coffee", 10, 5.00));
        products.add(new Product("Tea", 10, 3.00));
        products.add(new Product("Chocolad", 10, 2.00));
        products.add(new Product( "Juice", 10, 1.50));

    }

    public static Product getProduct(int productId) throws IllegibleItemException {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId < 0 || productId >= ProductDatabase.getProductsLength()){
            throw new IllegibleItemException();
        }
           return products.get(productId);
        }

    public static int getProductsLength() {
        return products.size();
    }
}

