package org.qsoft.dao;

import org.qsoft.entity.BankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/3/13
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */

public class BankAccountDao {

    private Connection connection = null;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void insertBankAccount(BankAccount bankAccount) {
        try {
            PreparedStatement pstmt = this.connection.prepareStatement("insert into BANKACCOUNT(accountNumber, balance) values (?, ?)");
            pstmt.setString(1, bankAccount.getAccountNumber());
            pstmt.setString(2, String.valueOf(bankAccount.getBalance()));
            pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public BankAccount getBankAccountByNumberAccount(String accountNumber) {
        try {
            String queryString = "SELECT * FROM BANKACCOUNT WHERE ACCOUNTNUMBER ='" + accountNumber + "'";
            ResultSet resultSet = connection.createStatement().executeQuery(queryString);
            if (resultSet.next())
                return new BankAccount(accountNumber, resultSet.getDouble("balance"));
            else
                return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
