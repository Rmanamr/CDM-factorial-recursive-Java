/*Print input number factorial with a recursive function*/

import java.util.Scanner;

public class RecursiveFactorial{
    public static void main(String []args){
        while(true){
            System.out.println("Please enter a number to calculate it's factorial :");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println("*****");
            System.out.println(factorialRecursive(number));
            System.out.println("****************************************************");
        }
    }

    public static int factorialRecursive(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        else 
        return n*factorialRecursive(n-1);
    }
}


// by Arman Azarnik
// armanazarnik@gmail.com