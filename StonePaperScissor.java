import java.util.*;

public class StonePaperScissor {

    public static void main(String[] args) {

        String pa="Y";

        Random r=new Random();



        Scanner sc=new Scanner(System.in);

        //System.out.println(r.nextInt(3));

        int r_var=r.nextInt(3);//generates random number between 0-3(Exclusive)

        System.out.println("*****************************************************************");

        System.out.println("_________________________________________________________________");

        System.out.println("\t\t\t\t\tSTONE PAPER SCISSOR GAME\t\t\t");

        System.out.println("_________________________________________________________________");

        System.out.println("*****************************************************************");

        do {

            System.out.println("Enter your choice among following:");

            System.out.println("0 --> Stone");

            System.out.println("1 --> Paper");

            System.out.println("2 --> Scissor");

            System.out.print("Your choice->");

            int choice= sc.nextInt();

            if ((choice==0 && r_var==2) || (choice==1 && r_var==0) || (choice==2 && r_var==1)){

                System.out.println("My Choice is "+r_var);

                System.out.println("Congrats You win!!");

            }

            else if(choice==r_var){

                System.out.println("My Choice is "+r_var);

                System.out.println("Its a Tie!!");

            }

            else {

                System.out.println("My Choice is "+r_var);

                System.out.println("You lost!!");

            }

            System.out.print("Play Again(Y or N):");

            pa=sc.next();

        }while (pa.equalsIgnoreCase("y"));





    }



}
