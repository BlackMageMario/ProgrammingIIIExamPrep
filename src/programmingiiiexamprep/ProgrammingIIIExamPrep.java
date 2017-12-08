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
public class ProgrammingIIIExamPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        questionOneDriver();
    }
    public static void questionOneDriver()
    {
        Date companyStartDate = new Date(1980, 8, 2);
        Employee[] employees = new Employee[2];
        float[] managerHours = new float[52];
        float[] hourlyWorkerHours = new float[52];
        employees[0] = new Manager("Frank Glavin", "Not sure", new Date(1985, 8, 2), 200, managerHours);
        employees[1] = new HourlyWorker("Bobby Jim", "Also not sure", new Date(1985, 9, 3), 10, hourlyWorkerHours);
        for(int i = 0; i < 52; i++)
        {
            for(int j = 0; j < employees.length; j++)
            {
                 float earningPerWeek = employees[j].earnings(i);
                 
                 if((new Date().getTime() - employees[j].getDate().getTime())/ (1000 * 60 * 60 * 24) > 365 * 5)
                 {
                     //A note: java.util.date class is horribly broken
                     //Note: need to include current date somehow
                     earningPerWeek += 100;
                 }    
                 
            }
           
        }
    }
}
