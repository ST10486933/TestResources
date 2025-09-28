
package com.mycompany.onlinelearning;

public class Content {
    
    private String title;
    private int minutes;

    public Content(String title, int minutes) {
        this.title = title;
        this.minutes = minutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    @Override
    public String toString(){
        return title + "(" + minutes + ", ";
    }
}
