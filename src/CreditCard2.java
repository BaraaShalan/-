public class CreditCard2 {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public CreditCard2(String customer, String bank, String account, int limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = 0;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        } else {
            balance += price;
            return true;
        }
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            return;
        }
        balance -= amount;
    }
}