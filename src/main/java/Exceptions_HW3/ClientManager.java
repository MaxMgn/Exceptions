package Exceptions_HW3;

public class ClientManager {
    public static void performTransaction(int clientId, double totalPrice) throws InsufficientFundsException, IllegibleItemException {
        //int quantityToPurchase;
        Client client;
            client = ClientDatabase.getClient(clientId);
            client.setAvailableBalance(client.getAvailableBalance() - totalPrice);


    }
}
