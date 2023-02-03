import java.util.Scanner;

public class TemperatureConverter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Hello this is my Temperature Converter!");
         System.out.println("Type fc for Fahrenheit to Celsius conversion");
         System.out.println("Type cf for Celsuis to Farenheit Conversion");
         
        
         Scanner scan = new Scanner(System.in);    //sets up scanners
         Scanner scan1 = new Scanner(System.in);
 		//input
 		Scanner input = new Scanner (System.in);
 		
         String action = scan.nextLine();    //tells computer  to take user input
         
         if("fc".equals(action))    //fahrenheit to celsius converter
         {
         	fah fahObject1 = new fah();
 	       fahObject1.fahCel();   
         }
         if("cf".equals(action))    //celsius to farenheit converter
         {
         	cel celObject2 = new cel();
 	      celObject2.celFah();   
         }      
     }

	}


