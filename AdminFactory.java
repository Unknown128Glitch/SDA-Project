package sdaproject;

public class AdminFactory {
  
        public static final String[] names = {"Rob"};
        public static final String[] password = {"123"};
    public static AbstractAdmin getAdmin(String name,String pass){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)&& password[i].equalsIgnoreCase(pass)){
                return new RealAdmin(name,pass);
         }      
      }
      return new NullAdmin();
   }


}
