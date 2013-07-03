package org.qsoft.service;

import org.qsoft.dao.BankAccountDao;
import org.qsoft.dao.utils.ConnectionUtils;
import org.qsoft.entity.BankAccount;

import java.sql.Connection;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/3/13
 * Time: 1:56 PM
 * To change this template use File | Settings | File Templates.
 */

public class BankAccountService {
    public static void main(String[] args) {
        BankAccountDao obj = new BankAccountDao();
        Connection connection = (new ConnectionUtils()).getConnection();
        obj.setConnection(connection);
        BankAccount bankAccount = obj.getBankAccountByNumberAccount("123");
    }
}
