public class Question {
    // Question to ask the user
    private String question;
    // Possible answers to the question being asked
    private String[] answers;
    // Correct answer to the question
    private int answer;

    // Constructor to build a Question object from a question, a set of
    // answers and the correct answer as an integer. This method will set
    // the provided inputs to their respective properties in the Question
    // object.
    public Question(String question, String[] answers, int answer) {
        this.question = question;
        this.answers = answers;
		this.answer = answer - 1;
    }

    // questionFromLine will take in a line from a CSV file and creates a
    // new Question object from the line. The line will be split by the ","
    // and a string array will be returned. The first piece will be the
    // question and the last will be the correct answer as an integer. The
    // middle pieces are the possible answers but there can be two or more.
    public static Question questionFromLine(String line) {
        String[] str = line.split(",");
        // We don't want the first or last so subtract 2
        String[] arr = new String[str.length-2];
        for(int i = 0; i < str.length-2; i++) {
            arr[i] = str[i+1];
        }
        int ans = Integer.parseInt(str[str.length-1]);
        return new Question(str[0], arr, ans);
    }

    // checkAnswer will check to see if the answer provided by the user
    // is the expected answer. If the two are equal, it will return a 
    // value of true, otherwise return false.
    //
    // In the CSV, the answer provided will be like the following:
    //     a == 1
    //     b == 2
    //     c == 3
    //     ...
    //
    // When checking the answer we need to look at the following values:
    //     a == 0
    //     b == 0
    //     c == 2
    //     ...
    public boolean checkAnswer(int answer) {
        if (this.answer < 0) {
            return true;
        }
        return answer == this.answer;
    }

    // toString will turn a Question object into a printable string.
    // It will take the object and turn it into something like the
    // following:
    //
    // This is the question?
    //   a. Answer 0
    //   b. Answer 1
    //   c. Answer 2
    //   d. Answer 4
    //
    // The question should be represented as a single string using "\n"
    // for line breaks inside of the string.
    public String toString() {
        String str = String.format("%s\n", this.question);
        for(int i = 0; i < this.answers.length; i++) {
            str += String.format("\t%c. %s\n", 'a' + i, answers[i]);
        }
        return str;
    }
}