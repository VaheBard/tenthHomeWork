package accounts;

public class CheckingAccount extends Account {
    private final long minBalance;

    public CheckingAccount(long balance) {
        super(balance);
        this.minBalance = 0;
    }

    @Override
    public long getBalance() {
        if (balance < 0) {
            System.out.println("The balance of CheckingAccount can be only positive, but now it is: ");
        }
        return super.getBalance();
    }

    @Override
    public boolean pay(long amount) {
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Not available money!");
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        return super.add(amount);
    }
}
