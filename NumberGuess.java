import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random r=new Random();
        int userch;
        String cont="Y";
        System.out.println("*********************************************************************");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tNumber Guessing Game\t\t\t");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("*********************************************************************");
        System.out.println("Enter Number Between 0-100:");
        Scanner sc=new Scanner(System.in);
        do {
            int rand=r.nextInt(100);
            int count=0;
            do {
                System.out.println("Enter your guess:");
                userch=sc.nextInt();
                if (userch > rand) {
                    System.out.println("Lesser number please!");
                } else if (userch < rand) {
                    System.out.println("Greater Number please!");
                } else {
                    System.out.println("You Guessed it correct in " + count + " attempts !!!!!!");
                }
                count++;

            } while (rand != userch);
            System.out.println("Play again:(Y/N):");
            cont = sc.next();
        }while(cont.equalsIgnoreCase("Y"));
    }
}
