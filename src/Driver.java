public class Driver {

    public static void main(String[] args) {
        Account nadine = new Account("Nadine");
        nadine.deposit(500.0);
        Account ejila = new Account("Ejila");
        ejila.deposit(200.0);
        nadine.transfer(100.0, ejila);
        ejila.withdraw(50.0);
    }
}
