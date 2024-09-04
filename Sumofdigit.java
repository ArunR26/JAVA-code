package dsa;

public class Sumofdigit {
    public static void main(String[] args) {
        
        int number = 34597;
     
        int sum = sumOfDigits(number);
    
        System.out.println("The sum of digits of " + number + " is " + sum);
    }
    public static int sumOfDigits(int number) {
        
        number = Math.abs(number);
        
        int sum = 0;
        
        while (number > 0) {
         
            int digit = number % 10;
            
           sum += digit;
        
            number /= 10;
        }
        
        return sum;
    }
}
