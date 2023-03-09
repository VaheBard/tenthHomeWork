package accounts;

public class SavingsAccount extends Account {
    private final long minBalance;

    public SavingsAccount(long balance, long minBalance) {
        super(balance);
        this.minBalance = minBalance;
    }

    @Override
    public long getBalance() {
        if (balance < 0) {
            System.out.println("The balance of SavingsAccount can be only positive, but now it is: ");
        }
        return super.getBalance();
    }

    @Override
    public boolean pay(long amount) {
        if ((balance - amount) >= minBalance) {
            balance = balance - amount;
            return true;
        }
        System.out.println("Not available money!");
        return false;
    }
}
