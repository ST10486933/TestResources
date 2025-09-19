
package com.mycompany.fitnesscentre;

public class FitnessCentre {
    
    public static void main(String[] args) {
        
        // 2D array of members attending the fitness centre
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        int [][] members = {
            {12, 15, 14, 11, 20},
            {10, 9, 8, 12, 10},
            {18, 21, 17, 22, 19}
        };
        
        CentreReport report = new CentreReport(days, members);
        String result = report.createReport();
        
        System.out.println(result);
    }
}
