
package com.mycompany.bugtrackersystem;

import java.util.ArrayList;

public class BugTracker {
    private ArrayList<Bug> bugs;
    
    public BugTracker()
    {
        bugs = new ArrayList<>();
    }
    
    public void addBug(Bug bug)
    {
        bugs.add(bug);
    }
    
    public void resolveBugByID(int bugID)
    {
        for (Bug bug: bugs)
        {
            if (bug.getBugID() == bugID)
            {
                bug.setStatus(true);
                break;
            }
        }
    }
    
    public int countUnresolved()
    {
        int count = 0;
        for (Bug bug : bugs)
        {
            if (!bug.isStatus()) count++;
        }
        return count;
    }
    
    public ArrayList<Bug> filterUnresolvedBySeverity(Severity severity)
    {
        ArrayList<Bug> filtered = new ArrayList<>();
        for (Bug bug : bugs)
        {
            if (!bug.isStatus() && bug.getSeverity() == severity)
            {
                filtered.add(bug);
            }
        }
        return filtered;
    }
    
    public void printSummary()
    {
        System.out.println("=== Bug Tracker ===");
        for (Bug bug: bugs)
        {
            System.out.println(bug);
        }
        
        System.out.println("\nUnresolved Count: " + countUnresolved());
        
        ArrayList<Bug> highSeverity = filterUnresolvedBySeverity(Severity.HIGH);
        if (!highSeverity.isEmpty())
        {
            System.out.println("\nHIGH severity (unresolved):");
            for (Bug bug: highSeverity)
            {
                System.out.println("#" + bug.getBugID() + " " + bug.getTitle());
            }
        }
    }
}
