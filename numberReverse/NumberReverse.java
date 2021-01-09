import java.util.Scanner;

public class NumberReverse{

	public static void main(String args[]){
	
		Scanner number = new Scanner(System.in);
		System.out.print("Enter a number: ");
	
		int inputNumber = number.nextInt();
        	int reverseNumber=0;        
        
        	while(inputNumber > 1){
            		int lastDigit = inputNumber%10;
            		inputNumber/=10;            
            		reverseNumber=reverseNumber*10+lastDigit;         
        	}
       
        	System.out.println("Reverse number :"+reverseNumber);    
    	}
}
