
package arraywithforloop;

/**
 *
 * @author Legendary Proo
 */
public class ArrayWithForLoop
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Printing all Array using for loop
        String[] CurrArray = new String[5];
        CurrArray[0]= "USD";
        CurrArray[1]= "EUR";
        CurrArray[2]= "CAD";
        CurrArray[3]= "GBP";
        CurrArray[4]= "ZAR";
        
        //for loop
        for(String str : CurrArray){
            System.out.println(str);
        };
        //printing a devider
        System.out.println("-----------");
        
        
        //integer Array
        int[] CurreArray = {7,10,13,14,17};
        
        //for loop on printing all the legth
        for(int i=0; i<CurreArray.length;i++){
            System.out.println(CurreArray[i]);
    }
    
}
}

