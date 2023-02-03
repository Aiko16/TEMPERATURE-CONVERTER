import java.util.Scanner;

public class cel {
	public void celFah() {
		 boolean go = true;    //sets up loop
	        
	        while(go)    //creates loop to top	
	        {
	        	System.out.println("Welcome to Celsuis to Fahrenhiet converter");
	              
	            Scanner scan = new Scanner(System.in);    //sets up scanners
	            Scanner scan1 = new Scanner(System.in);
	        
	    		//input
	    		Scanner input = new Scanner (System.in);
	    		
	            String action = scan.nextLine();    //tells comp. to take user input
	            
	       
	               System.out.println("Now type in number you will like to convert from Celsuis to Fahrenhiet");
	                double cel1 = scan.nextDouble();
	                double res1 = cel1 * 1.8;
	                double res2 = res1 + 32;
	                System.out.println("The result is " + res2 + " degree Fahrenheit" );
	            }
	          	            
	            
	}
}


