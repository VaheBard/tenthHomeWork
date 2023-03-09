package accounts;

public class CreditAccount extends Account {
    private final int maxBalance;

    public CreditAccount(long balance) {
        super(balance);
        this.maxBalance = 0;
    }

    @Override
    public long getBalance() {
        if (balance > 0) {
            System.out.println("The balance of CreditAccount can be only negative, but now it is: ");
        }
        return super.getBalance();
    }

    @Override
    public boolean pay(long amount) {
        return super.pay(amount);
    }

    @Override
    public boolean add(long amount) {
        if ((balance + amount) > maxBalance) {
            return false;
        }
        balance += amount;
        return true;
    }
}
