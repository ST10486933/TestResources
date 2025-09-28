
package com.mycompany.bugtrackersystem;

public class Bug {
    
    private int bugID;
    private String title;
    private Severity severity;
    private boolean status;

    public Bug(int bugID, String title, Severity severity, boolean status) {
        this.bugID = bugID;
        this.title = title;
        this.severity = severity;
        this.status = status;
    }

    public int getBugID() {
        return bugID;
    }

    public void setBugID(int bugID) {
        this.bugID = bugID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override 
    public String toString() {
        return "[" + bugID + "] " + title + " (" + severity + ") - Resolved: " + status;
    }
            
}
