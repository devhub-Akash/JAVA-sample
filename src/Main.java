import java.util.Scanner;
import java.util.*;

class Main
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
//   Here we declare variables

        double Balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){System.out.println("*************");
            System.out.println("NATIONAL BANK");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("**************");
            System.out.println("Enter your Choice(1-4) : ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> Balance -= withdraw(Balance);
                case 2 -> Balance += deposit();
                case 3 -> checkBalance(Balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

//        System.out.println("*****************************");
//        System.out.println("Thank you! Have a Nice Day...");
//        System.out.println("*****************************");
        scanner.close();
    }

    static void checkBalance(double balance){
        System.out.println("Your Balance is $" + balance);
    }
    static double deposit(){
        double amount;

        System.out.println("Enter an amount to be deposited");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount can't be negative ");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw(double Balance) {
        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > Balance) {
            System.out.println("Insufficient Funds");
        }
        else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
        return amount;
    }
}