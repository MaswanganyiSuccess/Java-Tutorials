
package different.operators;

/**
 * @author Legendary Proo
 */
public class DifferentOperators
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Not Equal to !<
        // IS Equal to ==
        // And For two condition to be true &&
        // The "OR" For one condtion to be true ||
        // Greater than or equal >=
        // less than or equal <=
        
        double EUR = 18.72;
        double USD = 19.58;
        
        // Not greater than
        if(EUR <= USD){
            System.out.println("Not greater than");
        }
        //Greater than 
        if(EUR >= USD){
            System.out.println("Greater than");
        }
        // IS equal to 
        if(EUR == USD){
            System.out.println("Is Equal to Each other");
          }
        // Not equal to Operatr
        if(EUR != USD){
            System.out.println("Is Not Equal to");
          }
        // AND AND operator
        if(EUR != USD && EUR <= USD){
            System.out.println("Not Equal And EUR is less than USD");
        }
        // The OR Operator 
        if(EUR <= USD || EUR == USD){
            System.out.println("EUR is Greater than USD or EUR is Equal to USD");
        }
    }
    
}
