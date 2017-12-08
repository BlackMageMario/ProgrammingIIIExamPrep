/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingiiiexamprep;

import java.util.Date;

/**
 *
 * @author Eamonn Hannon
 */
public class Manager extends Employee{
    private float weeklySalary;
    
    public Manager(String empName, String empAddress, Date empJoinDate,  float weeklySalary, float[] hoursWorkedPerWeek) 
    {
        super(empName, empAddress, empJoinDate, hoursWorkedPerWeek);
        //make an assumpt that the weekly salary of the employee
        //is entered into the constructor
        this.weeklySalary = weeklySalary/52;
    }

    @Override
    public float earnings(int week) {
        return weeklySalary;
    }
    
}
