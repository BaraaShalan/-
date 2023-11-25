public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;


    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
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

    public void updateCreditLimit(int newLimit) {
        if (newLimit >= balance) {
            limit = newLimit;
            System.out.println("Credit limit updated successfully.");
        } else {
            System.out.println("Error: New credit limit cannot be less than the current balance.");
        }
    }


    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }


    public void makePayment(double amount) {
        if (amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Error: Payment amount cannot be negative.");
        }
    }

    public String toString() {
        return "Customer: " + customer +
                "\nBank: " + bank +
                "\nAccount: " + account +
                "\nLimit: " + limit +
                "\nBalance: " + balance;
    }

        public static void main(String[] args) {
            CreditCard card = new CreditCard("John Doe", "ABC Bank", "123456789", 5000, 1000);

            System.out.println(card.toString());

            card.updateCreditLimit(7000);
            System.out.println(card.toString());

            card.updateCreditLimit(200);


        }

    }
