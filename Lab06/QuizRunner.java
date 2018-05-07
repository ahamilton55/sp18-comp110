import java.io.*;

public class QuizRunner {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Quiz quiz = new Quiz("Quiz 1", "example.csv");

        System.out.println(quiz.getName());
        System.out.println();

        quiz.runQuiz();

        System.out.printf("Score: %.1f%%\n\n", quiz.getScore());
    }
}