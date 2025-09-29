
package com.mycompany.usestaff;

import java.util.Scanner;

public class UseStaff {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the current staff number: ");
        int staffNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter the staff hiring location: ");
        String location = scanner.nextLine();
        
        StaffHiring hiring = new StaffHiring(staffNumber, location);
        hiring.printStaffHiring();
    }
}
