
package pkgfor.each.loop;

import java.util.ArrayList;

/**
 * @author Legendary Proo
 */
public class ForEachLoop
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // creating a for each loop
        String[] Currency = {"USDZAR", "USDCAD", "GBPUSD"};
        
        //Printing USing a For LOop
        for(String Pairs : Currency){
            System.out.println(Pairs);
        }
        
        //Using Arraylisting 
        ArrayList <String> Currencies = new ArrayList<String>();
        //Add Items
        Currencies.add("Dollar");
        Currencies.add("Pound");
        Currencies.add("Euro");
        Currencies.add("Rands");
        
        //Print a divider
        System.out.println("-------------");
        //Print using a for Loop
        for(String Pair : Currencies){
            System.out.println(Pair);
        }
    }
    
}
