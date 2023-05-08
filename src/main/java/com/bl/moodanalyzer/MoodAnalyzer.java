package com.bl.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
        this.message = "";
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
    public static void main(String[] args) {
        MoodAnalyzer analyser = new MoodAnalyzer("I am feeling happy");
        String mood = analyser.analyseMood();
        System.out.println("The mood is " + mood);

    }
}
