package exercise.ex6;

import exercise.ex6.Account;

public class testAccount {
    public static void main(String[] args) {
        Account thang = new Account("123acb", "thangnd", 1000000);
        Account thai = new Account("456def", "thaind", 5000000);

        System.out.println("ID: "+ thang.getID() + ". Name: "+ thang.getName() + ". Balance: " + thang.getBalance());
        System.out.println("ID: "+ thai.getID() + ". Name: "+ thai.getName() + ". Balance: " + thai.getBalance());

        //nap tien
        System.out.println("thang's balance  + 1.000.000. New balance:  " + thang.credit(1000000));

        // tru tien
        System.out.println("Thai's balance  - 2.000.000. New balance:  " + thai.debit(2000000));

        // chuyen tien
        System.out.println("Thai's transfer to Thang's account. Amount 500.000.");
   
        System.out.println("Thai's new balance: " + thai.transferTo(thang, 500000));
        System.out.println("Thang's new balance: " + thang.getBalance());

    }
}