package arraylisting;

import java.util.ArrayList;

/**
 * @author Legendary Proo
 */
public class ArrayListing
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // The Codes below will show the 2 difference between Arraylisting and Normal Array

        //Welcome Message
        System.out.println("Below is the Currency Available!!!");

        //Defining the first Array(Normal Array)
        String[] Pairs = new String[6];
        Pairs[0] = "USD";
        Pairs[1] = "CAD";
        Pairs[2] = "GBP";
        Pairs[3] = "EUR";
        Pairs[4] = "AUD";
        Pairs[5] = "ZAR";

        //Printing the normal Array
        System.out.println(Pairs[0]);
        System.out.println(Pairs[1]);
        System.out.println(Pairs[2]);
        System.out.println(Pairs[3]);
        System.out.println(Pairs[4]);
        System.out.println(Pairs[5]);
        
        //Print the Devider line
        System.out.println("-----------");
        
        //Below is the start of Arraylisting
        ArrayList PairsAva = new ArrayList();
        PairsAva.add("USD");
        PairsAva.add("CAD");
        PairsAva.add("GBP");
        PairsAva.add("EUR");
        PairsAva.add("AUD");
        PairsAva.add("ZAR");
        //Adding new item in our list
        PairsAva.add("CHF");
        //Removing old Item
        PairsAva.remove("AUD");
        //check if the currency is Already Added if not print false , if yes print True
        System.out.println(PairsAva.contains("JPY"));
        System.out.println(PairsAva.contains("ZAR"));
        //Clear all Array in the list\
        PairsAva.clear();
        //Printing the Arraylisting
        System.out.println(PairsAva);
        
    }

}
