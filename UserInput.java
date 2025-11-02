import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your firstname: "); 
		String firstName = input.nextLine();
		
				
		System.out.print("Enter lastname: ");
		String lastName = input.nextLine();
		
		System.out.printf("Welcome %s %s to FirstBank",firstName,lastName);
	}
}