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
public class HourlyWorker extends Employee{
    private float wagePerHour;
    public HourlyWorker(String empName, String empAddress,  Date empJoinDate, float hourlyWage, float[] hoursWorkedPerWeek) {
        super(empName, empAddress, empJoinDate, hoursWorkedPerWeek);
        wagePerHour = hourlyWage;
    }
    @Override
    public float earnings(int week) 
    {
        return wagePerHour * hoursWorkedPerWeek[week];
    }
    
}
