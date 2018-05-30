package exercise.ex6;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id1, String name1) {
        this.id = id1;
        this.name = name1;
    }
    public Account(String id2, String name2, int balance2) {
        this.id = id2;
        this.name = name2;
        this.balance = balance2;
    }

    public String getID() { 
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) 
            balance = balance - amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;

    }

    public int transferTo(Account other, int amount) {
        if (amount <= balance) {
            other.credit(amount);
            balance = balance - amount;
        }
            
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

}