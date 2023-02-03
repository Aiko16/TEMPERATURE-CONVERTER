import java.util.Scanner;

public class fah {
	public void fahCel() {
		 boolean go = true;    //sets up loop
	        
	        while(go)    //creates loop to top	
	        {
	        	System.out.println("Welcome to Fahrenheit to Celsuis converter");
	              
	            Scanner scan = new Scanner(System.in);    //sets up scanners
	            Scanner scan1 = new Scanner(System.in);
	        
	    		//input
	    		Scanner input = new Scanner (System.in);
	    		
	            String action = scan.nextLine();    //tells comp. to take user input
	            
	       
	               System.out.println("Now type in number you will like to convert from fahrenheit to celsuis");
	                int fah1 = scan.nextInt();
	                int res1 = (fah1 -32)*5;
	                int res2 = res1 / 9;
	                System.out.println("The result is " + res2 + " degree Celsuis" );
	            }
	          	            
	            
	        }
	}
