package sdaproject;
import java.util.*;

public class model extends car{
    
    Hashtable<String, Integer> models = new Hashtable<String, Integer>();
    
    public void mprint(){
         int ch = print();
        
        models.put("vfx", 80);
        models.put("vfr", 10 );
        models.put("LLL", 60);
        models.put("PPP", 15 );
       
        
        
        
        
        if (ch == 1){
            System.out.println("Select Model \n 1.VFX \n 2.VFR \n Enter:");
            Scanner input = new Scanner(System.in);
            int ch1 = input.nextInt();
            switch(ch1){
                case 1:
                    System.out.println("\nVFX : (Prize = " +models.get("vfx") +")\n");
                    break;
                case 2:
                    System.out.println("\nVFR : (Prize = " +models.get("vfr") +")\n");
                    break;
            }
        }
        
        if (ch == 2){
             System.out.println("Select Model \n 1.LLL \n 2.PPP \n Enter:");
            Scanner input = new Scanner(System.in);
            int ch1 = input.nextInt();
            switch(ch1){
                case 1:
                    System.out.println("\n LLL : (Prize = " +models.get("LLL") +")\n");
                    break;
                case 2:
                    System.out.println("\n PPP : (Prize = " +models.get("PPP") +")\n");
                    break;
            }
            }
        }
    } 
    

