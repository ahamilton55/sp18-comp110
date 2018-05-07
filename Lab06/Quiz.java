import java.io.*;
import java.util.Scanner;

public class Quiz {
    // Name of the Quiz
    private String name;
    // Questions in the Quiz
    private Question[] questions;
    // True or false based on the results provided by the user. Allows us
    // to keep track of answers after the test is completed.
    private boolean[] answers;

    // This constructore will take in the name of the Quiz and a
    // filename where questions will be pulled from. This constructor
    // will read each line of 
    public Quiz(String name, String filename) throws FileNotFoundException, IOException {
        this.name = name;
        this.questions = new Question[0];

        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String text = null;
        while ((text = reader.readLine()) != null) {
            this.questions = addQuestion(Question.questionFromLine(text));
        }
        reader.close();
    }

    // Adds a question to the questions array. The array needs to be
    // expanded when a new question is added and this method should
    // take care of all of that. This method should return an array
    // of questions back to the user with the original questions and
    // the new question last.
    public Question[] addQuestion(Question q) {
        int len = this.questions.length;
        Question[] qs = new Question[len+1];
        for(int i = 0; i < len; i++) {
            qs[i] = this.questions[i];
        }
        qs[len] = q;
        return qs;
    }

    public String toString() {
        String str = String.format("%s\n\n", this.name);
        for(int i = 0; i < this.questions.length; i++) {
            str += this.questions[i].toString();
        }
        return str;
    }

    // runQuiz will quiz the user. It will ask the user each question,
    // get the user's answer and checks the answer provided by the user.
    // Currently this method will ask the questions in the order provided
    // inside of the CSV file. Answer results should be stored in the
    // answers array as "true" for correct and "false" for incorrect.
    public void runQuiz() {
        Scanner in = new Scanner(System.in);
        this.answers = new boolean[this.questions.length];

        for(int i = 0; i < this.questions.length; i++) {
            System.out.printf("%02d. %s\n", i+1, this.questions[i]);
            System.out.print("Answer: ");
            char ans = in.next().charAt(0);

            this.answers[i] = this.questions[i].checkAnswer(ans - 'a');
            System.out.println();
        }
        System.out.println();
        in.close();
    }

    // Returns the name of the test provided in the Quiz constructor.
    public String getName() {
        return this.name;
    }

    // Returns the score out of 100 based on the answers provided by the user.
    // It is calculated by counting the number of true values in the answers
    // array divided by the length of that array. Multiply the results by 100.
    public double getScore() {
        int correct = 0;
        for(int i = 0; i < this.answers.length; i++) {
            if (this.answers[i]) {
                correct++;
            }
        }
        return 100 * ((double)correct / (double)this.answers.length);
    }
}