package com.course1;

public class Main {
    public static void main(String[] args) {
        /*Classes*/
//        Car toyota = new Car();
//        Car ferrari = new Car();
//
//        toyota.setModel("2021-X Series");
//
//        System.out.println(toyota.getModel());

        /*SimpleCalculator*/
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

        /*Person*/
//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName= " + person.getFullName());

        /*Bank Account*/
        BankAccount bank = new BankAccount("ZXC123", 0.00, "Johao Perlaza",
                "perlazajohao@gmail.com", "+593978970998");
//        BankAccount bank = new BankAccount();

        System.out.println("Balance Inicial: " + bank.getBalance());
        bank.depositFunds(100);
        bank.withdrawFunds(90);
        bank.withdrawFunds(15);
    }
}
