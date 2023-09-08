package Exceptions_HW3;

public class Client {
    final private String name;
    private double availableBalance;

    public Client(String name, int availableBalance) {
        this.name = name;
        this.availableBalance = availableBalance;
    }

    public String getName() {
        return name;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalanceAfterPurchase) throws InsufficientFundsException {
        if (availableBalanceAfterPurchase < 0){
            throw new InsufficientFundsException(this);
        }
        this.availableBalance = availableBalanceAfterPurchase;
        System.out.println("На счету клиента " + this.name + "а осталось: $" + this.getAvailableBalance());
    }

}
