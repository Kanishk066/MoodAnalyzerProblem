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
        try {
            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (NullPointerException e){
                return "Happy";
            }
        }
    public static void main(String[] args) {
        MoodAnalyzer analyser = new MoodAnalyzer("I am feeling happy");
        String mood = analyser.analyseMood();
        System.out.println("The mood is " + mood);
        MoodAnalyzer.testAnalyseMood();
    }
    public static void testAnalyseMood(){
        MoodAnalyzer analyser = new MoodAnalyzer("I am in Sad Mood");
       String mood = analyser.analyseMood();
        assert mood.equals("Sad") : "Test Case 1.1 (with constructor) Failed";

        analyser = new MoodAnalyzer("I am in Any Mood");
        mood = analyser.analyseMood();
        assert mood.equals("Happy") : "Test Case 1.2 Failed";

        analyser = new MoodAnalyzer(null);
        mood = analyser.analyseMood();
        assert mood.equals("Happy") : "Test Case 2.1 Failed";
    }
}
