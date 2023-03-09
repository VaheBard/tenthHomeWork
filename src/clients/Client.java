package clients;

import accounts.Account;

public class Client {
    private String name;
    private int maxAmountOfAccounts;
    private Account[] accountArray;
    public Client(String name, int maxAmountOfAccounts){
        this.name = name;
        this.maxAmountOfAccounts = maxAmountOfAccounts;
        this.accountArray = new Account[maxAmountOfAccounts];
    }
    public void setAccountArray(Account [] accountArray){
        this.accountArray = accountArray;
    }
    public Account [] getAccountArray(){
        return accountArray;
    }
    public void addAccount(Account account){
        for (int i = 0; i < accountArray.length ; i++){
            if(accountArray[i] == null){
                accountArray[i] = account;
                return;
            }
        }
        System.out.println("There is no available cell to adding new account!");
    }

    public boolean pay(long amount){
        for(Account acc : accountArray){
            if(acc.pay(amount)){
                return true;
            }
        }
        System.out.println("Can not paying! ");
        return false;
    }
}
