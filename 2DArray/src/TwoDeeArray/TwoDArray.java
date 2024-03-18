package TwoDeeArray;

/**
 * @author Legendary Proo
 */
public class TwoDArray
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //The code below will be functioning to the 2D array of currency or pairs which wil be structure by row And column
        // [row][col]
        String[][] Currency ={{"USDJPY","USDZAR","USDCAD"}, {"EURZAR","EURJPY","EURCAD"},{"GBPAUD","GBPCHF","GBPNZD"}};
        Currency[0][0]= "USDJPY";
        Currency[0][1]= "USDZAR";
        Currency[0][2]= "USDCAD";
        
        Currency[1][0]= "EURZAR";
        Currency[1][1]= "EURJPY";
        Currency[1][2]= "EURCAD";
        
        Currency[2][0]= "GBPAUD";
        Currency[2][1]= "GBPCHF";
        Currency[2][2]= "GBPNZD";
        //PRINT CURRENCY
        System.out.println(Currency[0][0]);
        System.out.println(Currency[0][1]);
        System.out.println(Currency[0][2]);
        System.out.println("-------------");
        System.out.println(Currency[1][0]);
        System.out.println(Currency[1][1]);
        System.out.println(Currency[1][2]);
        System.out.println("-------------");
        System.out.println(Currency[2][0]);
        System.out.println(Currency[2][1]);
        System.out.println(Currency[2][2]);
        
        // [ROW][COL]------ Array 2
        int[][] pairsArray = new int[4][4];
        pairsArray[0][0] = 478;
        pairsArray[0][1] = 457;
        pairsArray[0][2] = 325;
        pairsArray[0][3] = 158;
        
        pairsArray[1][0] = 222;
        pairsArray[1][1] = 257;
        pairsArray[1][2] = 359;
        pairsArray[1][3] = 477;
        
        pairsArray[2][0] = 525;
        pairsArray[2][1] = 489;
        pairsArray[2][2] = 501;
        pairsArray[2][3] = 400;
        
        pairsArray[3][0] = 859;
        pairsArray[3][1] = 789;
        pairsArray[3][2] = 444;
        pairsArray[3][3] = 100;
        
        //print Array 2
        System.out.println(pairsArray[0][0]);
        System.out.println(pairsArray[0][1]);
        System.out.println(pairsArray[0][2]);
        System.out.println(pairsArray[0][3]);
        System.out.println("----------------");
        System.out.println(pairsArray[1][0]);
        System.out.println(pairsArray[1][1]);
        System.out.println(pairsArray[1][2]);
        System.out.println(pairsArray[1][3]);
        System.out.println("----------------");
        System.out.println(pairsArray[2][0]);
        System.out.println(pairsArray[2][1]);
        System.out.println(pairsArray[2][2]);
        System.out.println(pairsArray[2][3]);
        System.out.println("----------------");
        System.out.println(pairsArray[3][0]);
        System.out.println(pairsArray[3][1]);
        System.out.println(pairsArray[3][2]);
        System.out.println(pairsArray[3][3]);
        
}
}