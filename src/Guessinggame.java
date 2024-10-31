import java.util.Scanner;
import java.util.Random;
public class Guessinggame{

     public static void main(String []args){
         // generates the random number by using the random class and method ,stored in Randomnum
        Random rand = new Random();
        int Randomnum = rand.nextInt(100)+1;
         @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Enter the number of trials 
         System.out.println("enter the number of trials:");
          int trials = sc.nextInt();
          
        // intialize the user score 
        int userscore =0;
        int count =1;
        
         while(trials>0){
             
             System.out.println("Guess the number:");
             int guessnumber = sc.nextInt();
             if(Randomnum==guessnumber){
                 System.out.println("congrats! you won the game");
                 userscore =count;
                 break;
                 
             }
             else if(guessnumber<Randomnum){
                 System.out.println("The guessnumber is low");
             }
             else{
                 System.out.println("The guessnumber is high");
             }
             trials--;
             count++;
        }
        System.out.println("The your score is " + userscore);
        System.out.println("The Random number is :" + Randomnum);
        
    }
}