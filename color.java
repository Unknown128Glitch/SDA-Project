package sdaproject;
import java.util.*;

public class color {
    
    Hashtable<String, Integer> colors = new Hashtable<String, Integer>();

    void print(){
        colors.put("blue", 80);
        colors.put("red", 10 );
        System.out.println("Select color \n 1.Blue \n 2.Red \n Enter:");
        Scanner input = new Scanner(System.in);
        int ch = input.nextInt();
        switch(ch){
            case 1:
                System.out.println("\nBlue : (Prize = " +colors.get("blue") +")\n");
                break;
            case 2:
                System.out.println("\nRed : (Prize = " +colors.get("red") +")\n");
                break;
        }
    } 
    
}
