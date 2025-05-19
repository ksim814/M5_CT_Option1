package recursionExercise;
import java.util.Scanner;

public class RecursiveProductCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("Enter 5 numbers:");
		readNumbers(scanner, numbers, 0);
		
		int product = calculateProduct(numbers, 0);
		System.out.println("The product of the 5 numbers is: " + product);
		
		scanner.close();
	}
		 //recursively read 5 numbers into array
	    public static void readNumbers(Scanner scanner, int[] numbers, int index) {
	        if (index < numbers.length) {
	            System.out.print("Enter number " + (index + 1) + ": ");
	            numbers[index] = scanner.nextInt();
	            readNumbers(scanner, numbers, index + 1);
	        }
	    }

	    //recursively calculate product of array elements
	    public static int calculateProduct(int[] numbers, int index) {
	        if (index == numbers.length - 1) {
	            return numbers[index];
	        }
	        return numbers[index] * calculateProduct(numbers, index + 1);
	    }
	}
