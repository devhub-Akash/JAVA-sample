import java.util.Scanner;
import java.util.*;

class Main
{
    public static void main(String[] args){
//   Here we declare variables
        Scanner scanner = new Scanner(System.in);
        double Balance;
        boolean isRunning = true;
        int choice;
        System.out.println("*************");
        System.out.println("NATIONAL BANK");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("**************");
        System.out.println("Enter your Choice(1-4) : ");
        choice = scanner.nextInt();

        switch (choice){
            case 1 -> System.out.println("Withdraw");
            case 2 -> System.out.println("Deposit");
            case 3 -> System.out.println("Check Balance");
            case 4 -> System.out.println("Exit");
            case 5 -> System.out.println("Invalid Choice");

        }

    }
}