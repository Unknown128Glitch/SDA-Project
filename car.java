package sdaproject;
import java.util.*;

public class car {

    Hashtable<String, Integer> cars = new Hashtable<String, Integer>();
  
     public int print(){
        cars.put("mehran", 80);
        cars.put("alto", 10 );
        
         System.out.print("Select Car \n 1.Mahran \n 2.Atlo \n Enter:");  
         Scanner input = new Scanner(System.in);
         int ch = input.nextInt(); 
       
       
        switch(ch){
            case 1:
                System.out.println("\nmehran : (Prize = " +cars.get("mehran") +") \n");
                break;
                
            case 2:
                System.out.println("\nalto : (Prize = " +cars.get("alto") +")\n ");
                break;
        }
        return ch;
    }   
}


