package com.pk.practice;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankEmiCalculation {
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static void main(String[] args) {
        double amount;
        int month;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Loan Amount");
        amount = scn.nextDouble();
        System.out.println("Enter Months");
        month = scn.nextInt();
        BankEmiCalculation obj = new BankEmiCalculation();
        obj.getEmiDetails(amount, month);

    }

    public void getEmiDetails(double loanAmount, int months) {
        int interestEMI = 10;
        double interest = months * interestEMI;
        double totalDueAmont = loanAmount + interest;
        double principalEmi = loanAmount / months;
        double totalEMI = principalEmi + interestEMI;

        System.out.println("Principal Amount: " + loanAmount);
        System.out.println("No Of EMI's: " + months);
        System.out.println("Total Payble Amount :" + loanAmount + "(Principal) + " + interest + "(Interest for 12 Months)=" + totalDueAmont);

        ZoneId z = ZoneId.of("Asia/Kolkata");
        LocalDate today = LocalDate.now(z);
        for (int i = 1; i <= months; i++) {
            double principalRemain = totalDueAmont - totalEMI;
            System.out.println("EMI No:" + i + ", \t" +
                    "Principal EMI:" + roundAvoid(principalEmi, 2) + ",\t" +
                    "Interest EMI=" + interestEMI + ",\t" +
                    "Total EMI=" + roundAvoid(totalEMI, 2) + ",\t" +
                    "EMI Date:" + today.plusMonths(i).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")) + ",\t" +
                    "Principal Remaining :" + roundAvoid(principalRemain, 2)

            );
            totalDueAmont = roundAvoid(principalRemain, 2);

        }
    }


}
