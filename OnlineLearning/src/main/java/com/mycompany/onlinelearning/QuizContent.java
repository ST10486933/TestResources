
package com.mycompany.onlinelearning;


public class QuizContent extends Content{
    
    private int questions;

    public QuizContent(String title, int minutes, int questions) {
        super(title, minutes);
        this.questions = questions;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }
    
    @Override
    public String toString(){
        return "Quiz: " + super.toString() + questions + " questions)";
    }
}
