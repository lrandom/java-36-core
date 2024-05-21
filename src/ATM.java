import models.Account;

import java.util.ArrayList;

public class ATM {
    ArrayList<Account> accounts = new ArrayList<>();
    private Account loggedInAccount;

    public ATM() {
        Account account = new Account("001", "Luan", "123456", 1000000);
        Account account1 = new Account("002", "Huy", "123456", 2000000);
        accounts.add(account);
        accounts.add(account1);
    }

    public Account authentication(String id, String pwd) {
        for (Account account : accounts) {
            if (account.getId().equals(id) && account.getPassword().equals(pwd)) {
                loggedInAccount = account;
                return account;
            }
        }
        return null;
    }

    public boolean widthdraw(float amount) {
        if (loggedInAccount.getBalance() >= amount) {
            loggedInAccount.setBalance(loggedInAccount.getBalance() - amount);
            return true;
        }
        return false;
    }

    public Account getLoggedInAccount() {
        return loggedInAccount;
    }
}
