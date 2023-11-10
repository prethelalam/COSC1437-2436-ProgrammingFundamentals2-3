public class SavingsAccount {
    private double interestRate;
    private double balance;


//constructor
public SavingsAccount(double startingBalance, double interest)
{
    this.balance = startingBalance;
    this.interestRate = interest;
}

//mutators
public void SetWithdraw(double amount)
{
    balance -= amount;
}

public void SetDeposit(double amount)
{
    balance += amount;
}

public void addInterest(double rate)
{
    double monthlyInterest = interestRate / 12;
    balance += balance * monthlyInterest;
}

//accessors

public double balance()
{
    return balance;
}

}

