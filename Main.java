package ATM;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myname = new Scanner(System.in);
        Admin c1 = new Admin();
        List<createAcc> accounts = new ArrayList<>();
        boolean continueLoop = true;
        while(continueLoop){
            c1.userRole();
            int c = myname.nextInt();
            myname.nextLine();
            switch(c){
                case 1:
                    System.out.print("Enter your name: ");
                    String n = myname.nextLine();
                    System.out.print("Enter your Initial deposit: ");
                    double b = myname.nextDouble();
                    createAcc ca = new createAcc(n, b);
                    accounts.add(ca);
                    ca.printAcc();
                    break;

                case 2:
                    if(accounts.size() > 0){
                        System.out.print("Enter account name: ");
                        String accountName = myname.nextLine();
                        boolean accountFound = false;
                        for(createAcc acc : accounts){
                            if(acc.getName().equals(accountName)){
                                System.out.println("Account Name: " + acc.getName());
                                System.out.println("Account Balance: " + acc.getBalance());
                                int choice = myname.nextInt();
                                switch(choice){
                                    case 1:
                                        break;
                                    case 2:
                                        continueLoop = false;
                                        break;
                                }
                                accountFound = true;
                                break;
                            }
                        }
                        if(!accountFound){
                            System.out.println("Account not found!");
                        }
                    }else{
                       System.out.println("No accounts found!"); 
                    }
                    break;

                case 3:
                    if(accounts.size() > 0){
                        System.out.print("Enter account name: ");
                        String accountName = myname.nextLine();
                        boolean accountFound = false;
                        for(createAcc acc : accounts){
                            if(acc.getName().equals(accountName)){
                                System.out.print("Enter deposit amount: ");
                                double deposit = myname.nextDouble();
                                acc.deposit(deposit);
                                accountFound = true;
                                break;
                            }
                        }
                        if(!accountFound){
                            System.out.println("Account not found!");
                        }
                    }else{
                       System.out.println("No accounts found!"); 
                    }
                    break;

                case 4:
                    if(accounts.size() > 0){
                        System.out.print("Enter account name: ");
                        String accountName = myname.nextLine();
                        boolean accountFound = false;
                        for(createAcc acc : accounts){
                            if(acc.getName().equals(accountName)){
                                System.out.print("Enter withdrawal amount: ");
                                double withdrawal = myname.nextDouble();
                                acc.withdraw(withdrawal);
                                acc.printBalance();
                                accountFound = true;
                                break;
                            }
                        }
                        if(!accountFound){
                            System.out.println("Account not found!");
                        }
                    }else{
                       System.out.println("No accounts found!"); 
                    }
                    break;

                case 5:
                    continueLoop = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
