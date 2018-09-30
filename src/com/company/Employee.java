package com.company;

import com.company.model.PositionTitle;

import java.text.NumberFormat;

public class Employee {

    private String name;
    private PositionTitle position;
    private boolean salary;
    private double payRate;
    private int shift;
    private String startDate;

    public Employee(){}

    public Employee(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionTitle getPosition() {
        return position;
    }

    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /* Calculate the amount of pay based on:
     * the amount of hours worked,
     * what shift your working in,
     * how much overtime you've worked */
    public void Calculate(double hoursIn){
        double payModify = 0;

        if(shift == 2){
            payModify = .05; // 5 percent if on second shift
        }
        else if(shift == 3){ // 10 percent if on third shift
            payModify = .10;
        }

        double overtimeHours = 0;
        double normalHours = 0;

        if(hoursIn > 40){ // Finds the amount of overtime hours worked
            normalHours = 40;
            overtimeHours = hoursIn - 40;
        }
        else {
            normalHours = hoursIn;
        }

        // Adds everything up and displays the total
        double modifiedPay = payRate + (payRate * payModify);

        double totalPay = 0;

        totalPay += normalHours * modifiedPay;

        totalPay += overtimeHours * (payRate + (payRate * 1.5));

        Display(totalPay);
    }

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    private void Display(double total){
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Pay Rate: " + nf.format(payRate));
        System.out.println("This weeks earnings: " + nf.format(total));
        System.out.println("");
    }
}
