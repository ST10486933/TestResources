
package com.mycompany.onlinelearning;

public class OnlineLearning {

    public static void main(String[] args) {
        System.out.println("=== Learning Catalog ===");
        
        Content content [] = new Content[]
        {
            new VideoContent("Data Structures Deep Dive", 45, 1080),
            new QuizContent("Arrays Checkpoint", 10, 12),
            new VideoContent("OOP Principles", 30, 720)
        };
        
        for (Content c: content)
        {
            System.out.println(c);
        }
        
        Content longest = content[0];
        for (Content c: content)
        {
            if (c.getMinutes() > longest.getMinutes())
            {
                longest = c;
            }
        }
        System.out.println("\nLongest item: " + longest.getTitle() + "(" + longest.getMinutes() + " min)");
    }
}
