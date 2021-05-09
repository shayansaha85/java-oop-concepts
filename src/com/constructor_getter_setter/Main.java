package com.constructor_getter_setter;

public class Main {
    public static void main(String[] args) {
        // Getter Setter code
        Car c = new Car();
        c.setModel("Ford");
        System.out.println(c.getModel());

        System.out.println();
        // Constructor code
        BankAccount a = new BankAccount("4121108001430",15000.00,"Shayan","shayan851997@gmail.com","8837396371");
        a.depositMoney(5000);
        a.displayDetails();
        System.out.println();
        a.withdrawMoney(3000);
        a.displayDetails();
    }
}
