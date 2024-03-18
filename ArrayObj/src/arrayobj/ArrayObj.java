package arrayobj;

/**
 * @author Legendary Proo
 */

//creating a method inside a class that is ggoing to Apply to All the Objects that i will create
class CableUSD
{
    String type = "cable";

    //Defining my method
    public static void CableIsUSD()
    {
        System.out.println("USD is Dollar");
    }
}

public class ArrayObj
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Aim is to create a list of Array containing objects
        CableUSD EUR = new CableUSD();
        CableUSD CAD = new CableUSD();
        CableUSD ZAR = new CableUSD();
        CableUSD AUD = new CableUSD();
        CableUSD JPY = new CableUSD();

        //Create a list of Array containing the obj inside
        CableUSD[] MyArrayList =
        {
            EUR, CAD, ZAR, AUD, JPY
        };

        //creating a for (method) and comanding the Array listing to say one thing
        for (CableUSD Pairs : MyArrayList)
        {
            Pairs.CableIsUSD();
        }
    }
}