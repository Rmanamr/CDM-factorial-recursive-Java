import java.util.Scanner;

/**Java CMD program for printing the factorial of the input number with a recursive method.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Factorial_Recursive{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            System.out.println("Please enter a number to calculate it's factorial :");
            Scanner input = new Scanner(System.in);

            /** reading the next integer number and storing it in an integer variable*/
            int number = input.nextInt();
            System.out.println("*****");

            /** passing the number to factorial_Calculator_Recursive method and storing the result in result variable of long data type */
            long result = factorial_Calculator_Recursive(number);
            System.out.println("The factorial of " +number+ " is : " +result);
            System.out.println("****************************************************");
        }
    }

    /** 
     * method for calculating the factorial of input with a recursive method.
     * @param number  int number to calculate the factoriaal
     * @return  factorial of the input number with long data type
     * <pre>
     *      factorial_Calculator_Loop(0); // Output: 1
     *      factorial_Calculator_Loop(4); // Output: 24
     * </pre>
    */
    public static long factorial_Calculator_Recursive(int number){
        if(number == 1 || number == 0){
            return 1;
        }
        else{
        return number*factorial_Calculator_Recursive(number - 1);
        }
    }
}