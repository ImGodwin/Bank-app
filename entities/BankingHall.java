package entities;

import java.util.Scanner;

public class BankingHall {
    public static void main(String[] args) {

        Client person = new Client("Dayyz", "Lagos", 50000, 200,
                1234, 4000, 2000);

        Bank bank = new Bank("Wema Bank", "Lagos", 100000, 2000);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type");
    }
}
