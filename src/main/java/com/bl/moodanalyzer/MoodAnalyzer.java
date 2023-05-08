package com.bl.moodanalyzer;

public class MoodAnalyzer {
     String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("happy")) {
            return "Happy";
        } else if (message.contains("sad")) {
            return "Sad";
        } else {
            return "Unknown";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Mood Analyzer Problem");
        MoodAnalyzer analyser = new MoodAnalyzer("I am feeling sad today");
        String mood = analyser.analyseMood();
        System.out.println("Mood: " + mood);
    }
}
