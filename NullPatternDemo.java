package sdaproject;

import java.util.Scanner;

public class NullPatternDemo {
   public boolean NPD() {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Username");
      String n = s.nextLine();
      System.out.println("Enter Passwrod");
      String p = s.nextLine();
     
      AbstractAdmin admin = AdminFactory.getAdmin(n,p);
          boolean a = admin.isNil();
     
          System.out.println(admin.getName()+" "+admin.getPass());
          return  a;
     
   }
}



    

