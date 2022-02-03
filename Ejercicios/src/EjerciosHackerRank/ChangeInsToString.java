package EjerciosHackerRank;

import java.util.Scanner;

public class ChangeInsToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "";
       int n;
		         
      Scanner sc = new Scanner(System.in);
      s = sc.nextLine();
      n = sc.nextInt();
      
      if(n== Integer.parseInt(s)) {
    	  System.out.println("Good job");
         }else {
        	 System.out.println("Wrong answer.");
         }
      
	   }//catch() {
		   
		   
		   
		   
	  // }
	}

class DoNotTerminate{
	
}
		         
		   
		   /*if (n == Integer.parseInt(s)) {
		    System.out.println("Good job");
		   } else {
		    System.out.println("Wrong answer.");
		   }
		  } catch (DoNotTerminate.ExitTrappedException e) {
		   System.out.println("Unsuccessful Termination!!");
		  }
		 }
		}

		//The following class will prevent you from terminating the code using exit(0)!
		class DoNotTerminate {

		 public static class ExitTrappedException extends SecurityException {

		  private static final long serialVersionUID = 1;
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

		*/
		
		
