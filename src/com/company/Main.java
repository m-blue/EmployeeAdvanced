package com.company;

import com.company.model.PositionTitle;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jane Doe", PositionTitle.ADMINISTRATION,true,27.00,1,"March 3");
        employee1.Calculate(45);

        Employee employee2 = new Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3, "April 1");
        employee2.Calculate(50);

        Employee employee3 = new Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2, "May 5");
        employee3.Calculate(35);
    }
}
