
package array.in.java;

/**
 * @author Legendary Proo
 */
public class ArrayInJava
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // This code will be showing the list of Currency pairs 
        
        // Print a welcome message with instructions
        System.out.println("The Following are the allowed currency pairs in the System!!!");
        
        //Create an Array listing which will contain string
        String AllPairs[] = {"USD","EUR","ZAR","AUD","CAD","GBP"};
        
        //Printing style 1
        System.out.println(AllPairs[0]);
        System.out.println(AllPairs[1]);
        System.out.println(AllPairs[2]);
        System.out.println(AllPairs[3]);
        System.out.println(AllPairs[4]);
        System.out.println(AllPairs[5]);
        
        //Printing a line Devider
        System.out.println("------------");
        
        //Printing style 2
        System.out.print(AllPairs[0]);
        System.out.print(", ");
        System.out.print(AllPairs[1]);
        System.out.print(", ");
        System.out.print(AllPairs[2]);
        System.out.print(", ");
        System.out.print(AllPairs[3]);
        System.out.print(", ");
        System.out.print(AllPairs[4]);
        System.out.print(", ");
        System.out.print(AllPairs[5]);
        System.out.println();
        //Printing a line Devider
        System.out.println("------------");
        
        //print using for loop printing style 3
        for (int i=0; i < AllPairs.length ; i++){
            System.out.println(AllPairs[i]);
        }
    };
    
}

