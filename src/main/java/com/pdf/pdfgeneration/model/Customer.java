package com.pdf.pdfgeneration.model;

import java.time.LocalDate;

public class Customer {

    private String branchName;

    private LocalDate todayDate;

    public Customer(String branchName, LocalDate todayDate) {
        this.branchName = branchName;
        this.todayDate = todayDate;
    }

    public Customer() {

    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public LocalDate getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(LocalDate todayDate) {
        this.todayDate = todayDate;
    }

    @Override
    public String toString() {
        return branchName  +
                 todayDate ;
    }
}
