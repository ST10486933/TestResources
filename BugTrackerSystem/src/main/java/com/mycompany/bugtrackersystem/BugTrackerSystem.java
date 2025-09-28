
package com.mycompany.bugtrackersystem;
        
public class BugTrackerSystem {

    public static void main(String[] args) {
        BugTracker tracker = new BugTracker();
        
        tracker.addBug(new Bug(1, "Login fails on empty pw", Severity.HIGH, false));
        tracker.addBug(new Bug(2, "Typo on dashboard", Severity.LOW, true));
        tracker.addBug(new Bug(3, "Null pointer in export", Severity.HIGH, false));
        tracker.addBug(new Bug(4, "Slow search", Severity.MEDIUM, false));
        tracker.addBug(new Bug(5, "Color contrast issue", Severity.LOW, true));
        
        tracker.printSummary();
    }
}
