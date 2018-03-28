// calculation of grade
import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
      Scanner input = new Scanner( System.in );
      int score;
      do {
        System.out.println("please enter score to know your grade or 'q' to quit.");
        score = input.nextInt();
        if (score <= 44) {
          System.out.println("Your grade is F");
        }
        else if (score <= 49 && score >= 45) {
           System.out.println("Your grade is D");
        }
        else if (score <= 59 && score >= 50) {
           System.out.println("Your grade is C");
        }
        else if ( score <= 69 && score >= 60) {
           System.out.println("Your grade is B");
        }
        else if (score >= 70) {
           System.out.println("Your grade is A");
        }
      } while(score != 'q');
    } 
}