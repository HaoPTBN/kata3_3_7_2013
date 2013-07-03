import org.junit.Before;
import org.junit.Test;
import org.qsoft.dao.BankAccountDao;
import org.qsoft.entity.BankAccount;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/3/13
 * Time: 2:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestDao {
    private String driver = "com.mysql.jdbc.Driver";
    private String stringConnection = "jdbc:mysql://localhost:3306/db_junit_test";
    private String username = "root";
    private String password = "";
    private Connection connection;

    @Before
    public void prepareConnection() throws Exception {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(stringConnection, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testOpenAccount() throws Exception {
        String numberAccount = "123456";

        BankAccount bankAccount = new BankAccount(numberAccount,10000);
        BankAccountDao bankAccountDao = new BankAccountDao();
        bankAccountDao.setConnection(connection);
        bankAccountDao.insertBankAccount(bankAccount);

        BankAccount bankAccountReturn = bankAccountDao.getBankAccountByNumberAccount(numberAccount);
        assertEquals(numberAccount, bankAccountReturn.getAccountNumber());
    }

    @Test
    public void testFindByAccountNumber() throws Exception {
        BankAccountDao bankAccountDao = new BankAccountDao();
        bankAccountDao.setConnection(connection);
        BankAccount bankAccount = bankAccountDao.getBankAccountByNumberAccount("123");
        assertEquals("123", bankAccount.getAccountNumber());
    }
}
