package pkgfor.loop.pattern;
import java.util.Scanner;

/**
 * @author Legendary Proo
 */
public class ForLoopPattern
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //printing a Question to the user
        System.out.println("How many $$ signs do you want to play out?");
        
        //Adding a scanner object
        Scanner Scan= new Scanner(System.in);
        //commandingthe next liene to Allow the user integer
        int DollarSign = Scan.nextInt();
        
       
        //creating a loop that gonna play a pattern
        //the loop is acting as number of rows
        for(int i = 1; i <= DollarSign; i++){
            // the loop identify number of $$ per row
            for(int n = 0; n < i; n++){
                System.out.print("$");
        }
            System.out.println();
        }
        //printing the loop to decrement
        //the loop is acting as number of rows
        for(int i = DollarSign - 1; i > 0; i-- ){
            // the loop identify number of $$ per row
            for(int n = 0; n < i; n++){
                System.out.print("$");
        }
            System.out.println();
        }
    }
}

