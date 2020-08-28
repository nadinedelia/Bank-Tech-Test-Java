public class Account {
    private double balance;
    private String name;
    public Account(String name) {
        this.name = name;
        balance = 0.0;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has £" + balance);
    }
    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println(name + "has £" + balance);
        }
        else {
            System.out.println("Withdrawal by " + name + " not possible");
        }
    }
    public void transfer(double amount, Account acc) {
        if (this.balance < amount) {
            System.out.println("Transfer failed");
        }
        else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("New balance of " + this.name + ": £" + this.balance);
            System.out.println("New balance of " + acc.name + ": £" + acc.balance);
        }
    }
}
