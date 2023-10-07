package entities;

public class Bank {
    private String name;
    private String location;
    private int totalMoneyInBank;
    private int numOfCustomers;

    public Bank(String name, String location, int totalMoneyInBank, int numOfCustomers) {
        this.name = name;
        this.location = location;
        this.totalMoneyInBank = totalMoneyInBank;
        this.numOfCustomers = numOfCustomers;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalMoneyInBank=" + totalMoneyInBank +
                ", numOfCustomers=" + numOfCustomers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalMoneyinBank() {
        return totalMoneyInBank;
    }

    public void setTotalMoneyinBank(int totalMoneyInBank) {
        this.totalMoneyInBank = totalMoneyInBank;
    }


    public void setNumOfCustomers(int numOfCustomers) {
        this.numOfCustomers = numOfCustomers;
    }
}
