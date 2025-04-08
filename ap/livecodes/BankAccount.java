package ap.livecodes;

public class BankAccount
{
    private double balance;
    // Methods and constructors below

    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

//    public boolean withdraw(double amount)
//    {
//        if (balance>=amount && amount>0) {
//            balance = balance - amount;
//            return true;
//        }
//        else
//            return false;
//    }

    public void withdraw(double amount) throws Exception {
        if (balance>=amount && amount>0) {
            balance = balance - amount;
        }
        else
            throw new Exception("balance>=amount && amount>0");
    }
}
