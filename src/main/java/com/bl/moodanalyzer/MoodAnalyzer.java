package com.bl.moodanalyzer;
enum ExceptionType {
    NULL_MESSAGE, EMPTY_MESSAGE, NO_SUCH_FIELD, NO_SUCH_METHOD, NO_SUCH_CLASS, OBJECT_CREATION_ISSUE
}

class MoodAnalysisException extends Exception {
    private ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
public class MoodAnalyzer {
     String message;
    public MoodAnalyzer() throws MoodAnalysisException {
        throw new MoodAnalysisException(ExceptionType.EMPTY_MESSAGE, "Message should not be empty");
    }

    public MoodAnalyzer(String message) throws MoodAnalysisException {
        if (message == null || message.isEmpty()) {
            throw new MoodAnalysisException(ExceptionType.NULL_MESSAGE, "Message should not be null");
        }
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(ExceptionType.NULL_MESSAGE, "Message should not be null");
        }
    }
    public static void main(String[] args) {
    }
}
