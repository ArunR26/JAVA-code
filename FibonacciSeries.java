	package dsa;
	import java.util.Scanner;

	public class FibonacciSeries {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of terms in the Fibonacci series: ");
	        int terms = scanner.nextInt();
	        
	        if (terms <= 0) {
	            System.out.println("Number of terms must be positive.");
	            return;
	        }
	        
	        System.out.println("Fibonacci Series up to " + terms + " terms:");
	        
	        int first = 0, second = 1;
	        
		        if (terms == 1) {
	            System.out.print(first);
	        } else if (terms >= 2) {
	            System.out.print(first + " " + second);
	            for (int i = 3; i <= terms; i++) {
	                int next = first + second;
	                System.out.print(" " + next);
	                first = second;
	                second = next;
	            }
	        }
	        
	        System.out.println();
	    }
	}
