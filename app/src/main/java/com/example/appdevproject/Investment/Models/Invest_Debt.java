package com.example.appdevproject.Investment.Models;

import com.example.appdevproject.Investment.Models.Interfaces.Debt;



public class Invest_Debt implements Debt {
    private Integer id, foreinKey;
    private String debtName;
    private Double amountBorred, interestRate;
    private Integer compoundsPerYear, loanTermInMonths;



    public Invest_Debt(String debtName, Double amountBorred, Double interestRate, Integer compoundsPerYear, Integer loanTermInMonths) {
        this.debtName = debtName;
        this.amountBorred = amountBorred;
        this.interestRate = interestRate;
        this.compoundsPerYear = compoundsPerYear;
        this.loanTermInMonths = loanTermInMonths;
    }

    public Invest_Debt(Integer id, Integer foreinKey, String debtName, Double amountBorred, Double interestRate, Integer compoundsPerYear, Integer loanTermInMonths) {
        this.id = id;
        this.foreinKey = foreinKey;
        this.debtName = debtName;
        this.amountBorred = amountBorred;
        this.interestRate = interestRate;
        this.compoundsPerYear = compoundsPerYear;
        this.loanTermInMonths = loanTermInMonths;
    }


    //show the repayment/amortization  schedule


    //what if i pay extra $50 per month?


    //what is the total value of this loan?


    //what should my payments be to pay off the loan in 10 months?




    public double getAnnualCompoundrate() {
        //ear formula https://corporatefinanceinstitute.com/resources/commercial-lending/effective-annual-interest-rate-ear/#:~:text=Apply%20the%20EAR%20Formula%3A%20EAR,n%20%3D%20Compounding%20periods


        //EAR=(1+interest/number of compounds per period) ^ num compounds per period -1
        // (1+10%/2 )^2 -1 =.1025

        double xx=(1+ (this.interestRate/100) / this.compoundsPerYear );
        xx=Math.pow ( xx,this.compoundsPerYear);
        xx-=1;
        xx=xx*100;

        return xx;
    }






    //getters and setter
    public String getDebtName() {
        return debtName;
    }

    public void setDebtName(String debtName) {
        this.debtName = debtName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForeinKey() {
        return foreinKey;
    }

    public void setForeinKey(Integer foreinKey) {
        this.foreinKey = foreinKey;
    }

    public Double getAmountBorred() {
        return amountBorred;
    }

    public void setAmountBorred(Double amountBorred) {
        this.amountBorred = amountBorred;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getCompoundsPerYear() {
        return compoundsPerYear;
    }

    public void setCompoundsPerYear(Integer compoundsPerYear) {
        this.compoundsPerYear = compoundsPerYear;
    }

    public Integer getLoanTermInMonths() {
        return loanTermInMonths;
    }

    public void setLoanTermInMonths(Integer loanTermInMonths) {
        this.loanTermInMonths = loanTermInMonths;
    }

}
