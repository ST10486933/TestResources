
package com.mycompany.fitnesscentre;


public class CentreReport {
    
    // Code Attribution
    // *******************************************
    // Title: Question 1-Working with enum
    // Author: Denzyl S Govender
    // Date: 2025
    // Code Version: 1.0
    // Availability: https://github.com/DenzylSGovender/PROG6112_Mock_Test_Resources/blob/main/Question1-Working%20with%20enum/src/main/java/com/mycompany/question1/CanteenReport.java
    
    private String [] days;
    private int [][] members;

    // Constructor
    public CentreReport(String[] days, int[][] members) {
        this.days = days;
        this.members = members;
        
    }
    
    // Getting total from each row
    public int getRowTotal (int membersTotal)
    {
        int sumMembers = 0;
        for (int j = 0; j < days.length; j++)
        {
            sumMembers += members[membersTotal][j];
        }
        return sumMembers;
    }
    
    // Getting total from each column
    public int getColumnTotal (int daysTotal)
    {
        int sumDays = 0;
        for (int i = 0; i < members.length; i++)
        {
            sumDays += members[i][daysTotal];
        }
        return sumDays;
    }
    
    // Get the overall total
    public int getOverallTotal()
    {
        int overallTotal = 0;
        for (int i = 0; i < members.length; i++)
        {
            overallTotal += getRowTotal(i);
        }
        return overallTotal;
    }
    
    // Get the membership group with highest overall
    public int getHighestMember()
    {
        int highMember = 0;
        for (int i = 1; i < members.length; i++)
        {
            if (getRowTotal(i) > getRowTotal(highMember))
            {
                highMember = i;
            }
        }
        return highMember;
    }
    
    
    // Get the day with the lowest attendance
    public int getLowestDay()
    {
        int lowDay = 0;
        for (int j = 1; j < days.length; j++)
        {
            if (getColumnTotal(j) < getColumnTotal(lowDay))
            {
                lowDay = j;
            }
        }
        return lowDay;
    }
    
    public String createReport()
    {
        String report = "=== Fitness Centre Attendance Report ===\n";
        
        // Table Headers
        report = report + "\t";
        for (String d: days)
        {
            report = report + d + "\t";
        }
        report = report + "| Total\n";
        
        // Table Rows
        for (int i = 0; i < members.length; i++)
        {
            report = report + Membership.values()[i] + "\t";
            for (int j = 0; j < days.length; j++)
            {
                report = report + members[i][j] + "\t";
            }
            report = report + "| " + getRowTotal(i) + "\n";
        }
        
        report = report + "---------------------------------------------\n";
        
        // Totals 
        report = report + "Total\t";
        for (int j = 0; j < days.length; j++)
        {
            report = report + getColumnTotal(j) + "\t";
        }
        report = report + "| "  +getOverallTotal() + "\n\n";
        
        // Members with highest overall
        int highMember = getHighestMember();
        report = report +"\nHighest Overall:"+ " " + Membership.values()[highMember] + "(" + getRowTotal(highMember) + ")\n";
        
        // Lowest Day
        int lowDay = getLowestDay();
        report = report + "Lowest Day: " + days[lowDay] + " (" + getColumnTotal(lowDay) + ")\n";
        
        return report;
    }
}
