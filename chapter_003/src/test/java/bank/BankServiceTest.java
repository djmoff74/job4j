package bank;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Class BankServiceTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 25.01.2020
 */
public class BankServiceTest {

    User user = new User("3434", "Petr Arsentev");
    BankService bank = new BankService();

    @Test
    public void addUser() {
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    @Test
    public void transferMoney() {
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        bank.addAccount(user.getPassport(), new Account("113", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150);
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(200.0));
    }
}
