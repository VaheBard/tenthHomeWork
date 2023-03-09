import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;
import clients.Client;

class Main {
    public static void main(String[] args) {

        Client client = new Client("Vanya", 3);
        client.addAccount(new CheckingAccount(1000));
        client.addAccount(new SavingsAccount(2000, 100));
        client.addAccount(new CheckingAccount(4000));
        client.addAccount(new CreditAccount(-24000));
        client.getAccountArray();
        client.pay(2000);

        for (int i = 0; i < client.getAccountArray().length; i++) {
            System.out.println(client.getAccountArray()[i].getBalance());

        }
    }
}