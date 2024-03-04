import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNum;
        do{
            System.out.println("Guess the Number");
            userNum = sc.nextInt();

            if (userNum == myNum){
                System.out.println("You guessed it right, correct number !!");
                break;
            }

            else if (userNum < myNum) {
                System.out.println("Your number is too small, try again !!");
            }

            else if (userNum > myNum) {
                System.out.println("Your number is too large, try again !!");
            }
        } while (userNum > 0);
    System.out.println("My Number was " + myNum);
    }
}