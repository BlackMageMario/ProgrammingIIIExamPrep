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
public abstract class Employee {
    private String name;
    private String address;
    //could add more info based on the company such as what office the employee
    //works in etc.
    //Note on design: earnings should probably take a number of hours worked per
    //week variable - and just ignore it for any salaried employees.
    //... I guess.
    private Date joinDate;
    protected float[] hoursWorkedPerWeek;
    public Employee(String empName, String empAddress, Date empJoinDate, float[] hoursWorkedPerWeek)
    {
        name = empName;
        address = empAddress;
        joinDate = empJoinDate;
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public Date getDate()
    {
        return joinDate;
    }
    public abstract float earnings(int week);//*returns* weekly pay
}
