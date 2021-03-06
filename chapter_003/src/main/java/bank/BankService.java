package bank;

import java.util.*;
/**
 * Class BankService
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 25.01.2020
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !this.users.get(user).contains(account)) {
                this.users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        return this.users.keySet().stream().filter(x -> x.getPassport().equals(passport)).findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            rsl = this.users.get(user).stream().filter(a -> a.getRequisite().equals(requisite)).findFirst().orElse(null);
            }

        return rsl;

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null) {
            rsl = src.transfer(dest, amount);
        }
        return rsl;
    }
}
