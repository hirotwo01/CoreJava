package Inheritance.BankAccount;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Bank and Savings Account");
            System.out.println("2. null");
            System.out.println("3. Costumer and Corporate Costumer");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter Account Number:");
                int accNo = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Account Holder name:");
                String name = sc.nextLine();
                System.out.println("Enter Balance:");
                double balance = sc.nextDouble();
                System.out.println("Interest Rate:");
                double rate = sc.nextDouble();
                SavingsAccount sa = new SavingsAccount(accNo, name, balance, rate);
                System.out.println("---------------ACCOUNT DETAILS-------------");
                sa.displaySavingsAccount();
                break;

                case 2:
                    System.out.println("Null");
                    break;

                case 3:
                    System.out.println("Enter Costumer ID:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Costumer Name:");
                    String name1=sc.nextLine();
                    System.out.println("Phone Number:");
                    String contact= sc.nextLine();
                    System.out.println("Is the costumer Corporate?");
                    System.out.println("Press y if yes otherwise any other word");
                    char a= sc.nextLine().charAt(0);
                    if(a=='y'){
                        System.out.println("Enter Company Name:");
                        String company =sc.nextLine();
                        System.out.println("Enter Company Reg Number:");
                        String reg=sc.nextLine();
                        CorporateCostumer cc=new CorporateCostumer(id, name1,contact,company,reg);
                        System.out.println("\n--- CORPORATE COSTUMER ---");
                        cc.displayCorporateCostumer();
                    }
                    else {
                        Costumer c =
                                new Costumer(id, name1, contact);

                        System.out.println("\n--- NORMAL COSTUMER ---");
                        c.displayCostumer();
                    }
                    break;

            }
        }while(choice!=4);
    }

}






















/**
 *  System.out.println("do you want to deposit or withdraw any amount?");
 *         System.out.println("press d to deposit w to withdraw or any other key for neither");
 *         char yn =sc.nextLine().charAt(0);
 *         if(yn=='w'){
 *             System.out.println("Enter the withdrawal amount:");
 *             double withdraw= sc.nextDouble();
 *         }
 *         else if(yn=='d'){
 *             System.out.println("Enter the amount to deposit:");
 *             double deposit= sc.nextDouble();
 *         }
 *         else {
 *             System.out.println("no withdrawals or deposits");;
 *         }
 */