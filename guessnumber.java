import java.util.Random;
import java.util.Scanner;


public class guessnumber {
    public static void main(String[] args) {
        int answer , guess ;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
         answer = rand.nextInt(100) + 1;
         int score = 100;
         int round = 5;
         System.out.println("**Welcome to Guessworld! , You will get 5 chances to guess the correct number**");
       while(round>0) {
        System.out.println("Please enter your guess (1-100) : ");
         guess = scan.nextInt();
        
        if(answer == guess) {
            System.out.println("Bingo! You win.");
            System.out.println("Your score is :" + score);
            break;
        }
        else if (answer > guess) {
            System.out.println("Sorry,u guessed low ! Guess again.");
        }
        else {
            System.out.println("Sorry, You guessed high!! Guess again.");
        }
        score-=20;
        round--;
    }
    if (round == 0) {
        System.out.println("Sorry! You didnt get the number in 5 guesses.");
        System.out.println("You lose. correct number was :" + answer);
        
    }
    }
}
