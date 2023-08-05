package ATM;

public class createAcc extends Admin {

    protected String name;
    protected double balance;

    public createAcc(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        printBalance();
    }
    
    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void printAcc(){
        System.out.println("............................");
        System.out.println("Welcome " + name +",");
        System.out.println("Your Account have been Created");
        System.out.println("............................");
        System.out.println("1) Return Main Page");
        System.out.println("2) Exit Program");
    }
}
