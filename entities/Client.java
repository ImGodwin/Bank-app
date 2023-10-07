package entities;

public class Client extends Bank {
    public int id;
    public int balance;
    public int previousBalance;

    public Client(String name, String location, int totalMoneyInBank, int numOfCustomers, int id,
                  int balance, int previousBalance) {
        super(name, location, totalMoneyInBank, numOfCustomers);
        this.id = id;
        this.balance = balance;
        this.previousBalance = previousBalance;
    }

    public void currentBalance(int num)
    {
        if (num >= 0)
        {
            this.balance = this.balance + num;
            this.previousBalance = num;
        }
    }

    public  void withdraw(int num)
    {
        if (num != 0)
        {
            this.balance = this.balance - num;
            this.previousBalance = num;
        }
    }

    public void checkTransaction()
    {
        if(this.previousBalance > 0)
        {
            System.out.println("Deposited: " + previousBalance);
        }
        else if(previousBalance < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(previousBalance));
        }
        else{
            System.out.println("No transaction occured");
        }
    }

    public void askForLoan(int x)
    { int request = (20 / this.balance) * 100;
        if (x > request)
        {
            System.out.println("You have: " + this.balance + " in your account meaning " +
                    "we cannot grant your loan request");
        }
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", balance=" + balance +
                ", previousBalance=" + previousBalance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(int previousBalance) {
        this.previousBalance = previousBalance;
    }
}
