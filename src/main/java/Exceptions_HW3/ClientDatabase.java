package Exceptions_HW3;

import java.util.ArrayList;

public class ClientDatabase {
    static ArrayList<Client> clients;

    public ClientDatabase() {
        clients = new ArrayList <Client>();
        clients.add(new Client("Иванов", 1000));
        clients.add(new Client("Петров", 20));
    }

    public static Client getClient(int clientId) throws IllegibleItemException {
        if (clientId < 0 || clientId >= clients.size()){
            throw new IllegibleItemException();
        }
        return clients.get(clientId);
    }
}
