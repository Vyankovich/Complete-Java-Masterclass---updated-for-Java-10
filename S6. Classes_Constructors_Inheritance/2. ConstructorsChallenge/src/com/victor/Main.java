package com.victor;

public class Main {

    public static void main(String[] args) {
/*
create a new class for a bank account
create fields for the account number, balance, customer name, email, phone number.

create getters and setters for each field
create two additional methods
1. to allow the customer to deposit funds (this should increment the balance field).
2. to allow the customer to withdrawal funds. This should deduct from the balance
field, but not allow the withdrawal to complete if their are insufficient funds.
You will want tot create various code in the Main class (the one created by IntelliJ)
to confirm your code is working.
add some println's in the two methods above as well.
*/
        BankAccount victor = new BankAccount();//"123", 0.00, "Victor", "vic@tor.com", "(48)123-456");
        System.out.println(victor.getBalance());
        System.out.println(victor.getNumber());

        victor.deposit(5000);
        victor.withdrawal(12_000);
        victor.withdrawal(3000);


    }
}
