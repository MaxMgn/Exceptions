package Exceptions_HW3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineShopUI {
    public static void main(String[] args) {
        ProductDatabase PDB = new ProductDatabase();
        ClientDatabase CDB = new ClientDatabase();
        Scanner scanner = new Scanner(System.in);
        boolean valuesAreCorrect = false;
        int clientId;
        int productId;
        int quantity;
        //double totalPrice = 0;
        while (!valuesAreCorrect) {
            try {
                System.out.print("Enter client ID: ");
                clientId = scanner.nextInt();
                System.out.print("Enter product ID: ");
                productId = scanner.nextInt();
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
                valuesAreCorrect = ShopManager.purchaseProduct(productId, quantity, clientId);
            } catch (InputMismatchException e) {
                System.out.println("The entered value should be integer");
            } catch (WrongInputValueException e) {
                System.out.println(e.getMessage());
            } catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
