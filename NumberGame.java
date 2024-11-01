import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        int total=0;
        final int max_attempts=5;
        final int max_rounds=3;
        final int range = 100;
        System.out.println("Welcome to the Number Game!!");
        System.out.println("Try to guess the number in between 1 to "+range);
        for(int round=1;round<=max_rounds;round++)
        {
            int targetNumber=random.nextInt(range)+1;
            boolean guessedCorrectly= false;
            System.out.println("\nRound"+round+":");
            System.out.println(max_attempts+" attempts To guess");
            for (int attempt=1; attempt<=max_attempts;attempt++)
            {
                 System.out.println("Attempt "+attempt+" Enter the target:");
                 int target=sc.nextInt();
                 sc.nextLine();
                 if (target==targetNumber)
                 {
                    System.out.println("Congrats! Guessed number is correct.");
                    total+=max_attempts-attempt+1;
                    guessedCorrectly=true;
                    break;
                    
                }
                
                else if (target>targetNumber)
                {
                     System.out.println("Too high!");
                }
                else
                {
                    System.out.println("Too low");
                }
            }
            if(!guessedCorrectly)
            {
                System.out.println("you're out of attempts.the correct number was "+targetNumber+".");
            }
            System.out.println("Do you want to play another round? (yes/no):");
            String response=sc.nextLine();
            if (!response.equalsIgnoreCase("yes"))
            {
                break;
            }
        }
        System.out.println("\nGame over! final Score :"+total);
        sc.close();
    }
}
 
