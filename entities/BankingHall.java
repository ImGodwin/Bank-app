package entities;

import java.util.Scanner;

public class BankingHall {
    public static void main(String[] args) {

        Bank bank = new Bank("Wema Bank", "Lagos", 100000, 2000);

        Client[] clients = new Client[15];
        for (int i = 0; i< clients.length; i++)
        {
            clients[i] = new Client("Dayyz", "Lagos", 50000, 200,
                    1234, 40000, 2000);
        }

        Scanner input = new Scanner(System.in);


        System.out.println("Type a: for balance \n b: for Deposit \n c: to withdraw \n " +
                "d: for loan  \n f: to exit");
        String resp = input.nextLine();

           switch (resp){
               case ("a"):
               {
                   System.out.println("Your account balance is: " + clients[1].getBalance());
                   break;
               }
               case ("b"): {
                   System.out.println("Please enter the amount you want to deposit");
                   int num = Integer.parseInt(input.nextLine());
                   System.out.println("your new balance is: " + clients[1].currentBalance(num));
                   break;
               }case ("c"): {
                   System.out.println("Enter the amount you want to withdraw");
                   int num = Integer.parseInt(input.nextLine());
                   System.out.println("After withdrawing: " +  num  + "\nyour new balance is: " + clients[1].withdraw(num));
                   break;
               }case ("d"): {
                   System.out.println("How much do you want for loan?");
                   int num = Integer.parseInt(input.nextLine());
                   System.out.println(clients[1].askForLoan(num));
                   break;
               }case ("e"): {
                   System.out.println("Thanks for banking with us");
               }
           }
        }
    }

