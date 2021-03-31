package com.company;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double t = (double)time;
        double total =0;
        total = (principalAmount*interestRate*t)/100;
        return total;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double t = (double)time;
        double total=0;
        total =((principalAmount)*(Math.pow((1+(interestRate/100)),t)))-principalAmount;
        return total;
    }
}
public class Main {
    public static void main (String args[]) {
        SiCi siCi = new SiCi();
        double si = siCi.simpleInterest(1000.0, 2, 5);
        double ci = siCi.compoundInterest(1000.0, 2, 5);
        System.out.println(si+" "+ci);
    }
}