package practice.OOP.Encapsulation;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("b34079074");
        b1.printInfo();

        b1.deposit(1000);
        b1.printInfo();

        b1.deposit(-500);
        b1.printInfo();

        b1.withdraw(300);
        b1.printInfo();

        b1.withdraw(800);
        b1.printInfo();

        b1.withdraw(200);
        b1.printInfo();
    }
}
