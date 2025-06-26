// TODO: Create a program that verifies if the inputed number is a prime number!

import java.util.Scanner;

class primesCheckerClass {
    public static String primesChecker(int num) {
        
        int halfOfNum = num / 2;
        int n = 2;
        boolean isPrime = true;

        while (n <= halfOfNum) {
            System.out.println(String.format("Checking divisor: %d", n));
            
            if (num % n == 0) {
                isPrime = false;
                break;
            } else {
                n++;
            }
        }
        String res = (isPrime) ? String.format("%d is prime!", num) : String.format("%d is not prime!", num);

        return res;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(primesChecker(number));
        
        scanner.close();

    }
}