package accounts;

public class Account {
    protected long balance;

    protected Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {

        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean pay(long amount) {
        balance = balance - amount;
        return true;
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }
}
