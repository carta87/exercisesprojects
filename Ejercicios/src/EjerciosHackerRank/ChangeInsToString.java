package EjerciosHackerRank;

import java.security.Permission;
import java.security.Security;
import java.util.Scanner;

public class ChangeInsToString {

	public static void main(String[] args) {
		
         DoNotTerminate.forbidExit();
      
         try {
        	 Scanner in = new Scanner(System.in);
        	 int n = in.nextInt();  
        	// System.out.println(n);
        	 
        	 in.close();  
        
        	
        	// Scanner text = new Scanner(System.in);
        	
        	// if (n>-100 && n<100) {}
        	
        	 String s="100";
        	 //s.compareTo(s);
        	 //String s = text.nextLine();
        	// System.out.println(s);
        	
        	 
    	     if(n== Integer.parseInt(s)) {
        	  System.out.println("Good job");
             }else {
            	 System.out.println("Wrong answer.");
             }
		
	       } catch (DoNotTerminate.ExitTrappedException e) {
	    	   System.out.println("Unsuccessful Termination!!" + e);
	         }
      
      
	     }
	} 

class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {

	  private static final long serialVersionUID = 1L;
	 }

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	}
      
/*	
class DoNotTerminate{
	
	public static class ExitTrappedException extends SecurityException {
		
		private static final long serialVersionUID = 1;
	
	}
	
	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				//super.checkPermission(permission); Opcional
				if(permission.getName().contains("exitVM")){
					throw new ExitTrappedException(); 
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
	
}*/
		   
		
		
		
