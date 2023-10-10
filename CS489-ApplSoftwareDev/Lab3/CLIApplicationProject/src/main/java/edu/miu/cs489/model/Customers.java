package edu.miu.cs489.model;

import java.time.LocalDate;

public class Customers {
    private String accountNo;
    private String firstName;

    private  String lastName;
    private LocalDate datOfBirth;
    private LocalDate dateAccountOpen;
    private Float accountBalance;

    public Customers(String accountNo, String firstName, String lastName, LocalDate datOfBirth, LocalDate dateAccountOpen, Float accountBalance) {
        this.accountNo = accountNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.datOfBirth = datOfBirth;
        this.dateAccountOpen = dateAccountOpen;
        this.accountBalance = accountBalance;
    }
    public Customers() {
        //Default constructor
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDatOfBirth() {
        return datOfBirth;
    }

    public LocalDate getDateAccountOpen() {
        return dateAccountOpen;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDatOfBirth(LocalDate datOfBirth) {
        this.datOfBirth = datOfBirth;
    }

    public void setDateAccountOpen(LocalDate dateAccountOpen) {
        this.dateAccountOpen = dateAccountOpen;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "accountNo='" + accountNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", datOfBirth=" + datOfBirth +
                ", dateAccountOpen=" + dateAccountOpen +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
