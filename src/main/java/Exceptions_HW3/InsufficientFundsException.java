package Exceptions_HW3;

public class InsufficientFundsException extends Exception{
    Client client;

    public Client getClient() {
        return client;
    }

    public InsufficientFundsException(Client client) {
        this.client = client;
    }
}
