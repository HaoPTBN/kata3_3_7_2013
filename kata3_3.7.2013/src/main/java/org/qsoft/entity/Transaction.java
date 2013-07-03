package org.qsoft.entity;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/3/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Transaction {

    private String accountNumber;
    private Long timeStamp;
    private Double amount;
    private String description;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
