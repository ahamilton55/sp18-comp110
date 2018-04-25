/**
 * MagicEightBall
 */
import java.util.*;

public class MagicEightBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String question;

        System.out.println();
        System.out.println("   Magic Eight Ball");
        System.out.println();
        System.out.println("       _.a$$$$$a._");
        System.out.println("    ,$$$$$$$$$$$$$.");
        System.out.println("   ,$$$$$$$$$$$$$$$$$.");
        System.out.println("  d$$$$$$$$$$$$$$$$$$$b");
        System.out.println(" d$$$$$$$$~'\"`~$$$$$$$$b");
        System.out.println("($$$$$$$p   _   q$$$$$$$)");
        System.out.println("$$$$$$$$   (_)   $$$$$$$$");
        System.out.println("$$$$$$$$   (_)   $$$$$$$$");
        System.out.println("($$$$$$$b       d$$$$$$$)");
        System.out.println(" q$$$$$$$$a._.a$$$$$$$$p");
        System.out.println("  q$$$$$$$$$$$$$$$$$$$p");
        System.out.println("   `$$$$$$$$$$$$$$$$$'");
        System.out.println("    `$$$$$$$$$$$$$'");
        System.out.println("      `~$$$$$$$~'");
        System.out.println();

        System.out.print("What is your question? ");
        question = in.nextLine();
        System.out.println();

        int num = rand.nextInt(20); 

        if (num == 0) {
            System.out.println("It is certain");
        } else if (num == 1) {
            System.out.println("It is decidedly so");
        } else if (num == 2) {
            System.out.println("Without a doubt");
        } else if (num == 3) {
            System.out.println("Yes definitely");
        } else if (num == 4) {
            System.out.println("You may rely on it");
        } else if (num == 5) {
            System.out.println("As I see it, yes");
        } else if (num == 6) {
            System.out.println("Most likely");
        } else if (num == 7) {
            System.out.println("Outlook good");
        } else if (num == 8) {
            System.out.println("Yes");
        } else if (num == 9) {
            System.out.println("Signs point to yes");
        } else if (num == 10) {
            System.out.println("Reply hazy try again");
        } else if (num == 11) {
            System.out.println("Ask again later");
        } else if (num == 12) {
            System.out.println("Better not tell you now");
        } else if (num == 13) {
            System.out.println("Cannot predict now");
        } else if (num == 14) {
            System.out.println("Concentrate and ask again");
        } else if (num == 15) {
            System.out.println("Don't count on it");
        } else if (num == 16) {
            System.out.println("My reply is no");
        } else if (num == 17) {
            System.out.println("My sources say no");
        } else if (num == 18) {
            System.out.println("Outlook not so good");
        } else {
            System.out.println("Very doubtful");
        }
    }
}