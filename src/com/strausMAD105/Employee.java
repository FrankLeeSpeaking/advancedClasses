package com.strausMAD105;

import java.text.NumberFormat;

public class Employee {

    // -------------- Declare variables ---------
    private String employeeName;
    private PositionTitle position;
    private boolean salary;
    private double payRate;
    private int employeeShift;
    private String startDate;
    private double hrsIn;

    public Employee(){}// ------------ initialize list of employees ----------

    public Employee(String employeeName, PositionTitle position, boolean salary, double payRate, int employeeShift,
                    String startDate, double hrsIn) {
        // ////////////// construct Employees
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.employeeShift = employeeShift;
        this.startDate = startDate;
        this.hrsIn = hrsIn;

    }// END of Employee constructor

    public PositionTitle getPosition() {
        return position;
    }// ---------- Get position from enum class PositionTitle -

    public void setPosition(PositionTitle position) {
        this.position = position;
    }// ---------- set position from enum class PositionTitle -

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    //----------- BEGIN get/set employeeName
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    // -------END get/set employeeName ------------

    //----------- BEGIN get/set employeeShift
    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public double getHrsIn() {
        return hrsIn;
    }

    public void setHrsIn(double hrsIn) {
        this.hrsIn = hrsIn;
    }

    private NumberFormat nf = NumberFormat.getCurrencyInstance();// -------- formatter object for currency display ----

    private double calculate(boolean salary, double employeeShift, double hrsIn, double payRate){

        if (salary){// --------- Salaried employee
            return payRate * hrsIn;
        }

        if (employeeShift == 2){
            payRate = payRate * 0.05 + payRate;// ------------ adjust payRate for 2nd shift --------

        }

        if (employeeShift == 3){
            payRate = payRate * 0.10 + payRate;// ------------ adjust payRate for 3rd shift --------

        }

        if (hrsIn <= 40) {//----------- check for overtime
            return hrsIn * payRate;//--------No O.T.
        }
        else{// ----------- Calculate O.T. rate
            double otHrs = hrsIn - 40;
            double otRate = payRate * 1.5;
            return (payRate * 40) + (otHrs * otRate);
        }
    }//-------- END method earned-------------

    public void displayAll() {// ------- class method to display data
        System.out.println("Name: " + getEmployeeName());
        //System.out.println("Start date: " + getStartDate()); **** Asked for but asked to be displayed
        System.out.println("Position: " + getPosition());
        System.out.println("Shift: " + getEmployeeShift());
        System.out.println("Salaried: " + isSalary());
        System.out.println("Hourly Rate: $" + getPayRate());
        System.out.println("Hours worked: " + getHrsIn());
        System.out.println("Pay for the week: " + nf.format(calculate(salary, employeeShift, hrsIn, payRate)));
        System.out.print("\n");

    }//--------- END of class method displayAll
}