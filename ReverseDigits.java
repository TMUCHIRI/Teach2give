//Question 5: Reverse Integer
//Write a program that takes an integer as input and returns an integer with reversed digit
//ordering.

import java.util.Scanner;

public class ReverseDigits {

    public static int reverseInt (int num){
        int reversed = 0;
        while(num!=0){
            int digit = num % 10;

            if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }

            if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8 )){
                return 0;
            }

            reversed= reversed * 10 + digit;
            num= num/10;
        }
        return reversed;

    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer: ");

        int input= scan.nextInt();

        int reversed = reverseInt(input);
        System.out.println("Reversed integer: "+reversed);

    }
}
