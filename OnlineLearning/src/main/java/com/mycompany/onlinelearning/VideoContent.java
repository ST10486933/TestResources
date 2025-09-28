
package com.mycompany.onlinelearning;

public class VideoContent extends Content{
    
    private int resolution;

    public VideoContent(String title, int minutes, int resolution) {
        super(title, minutes);
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
    
    @Override
    public String toString(){
        return "Video: " + super.toString() + resolution + "p)";
    }
}
