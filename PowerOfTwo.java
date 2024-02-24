//Question 3: Power of Two
//Write a program that takes an integer as input and returns true if the input is a power of two

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);

        int num = 0;
        System.out.println("Enter a number to test for power of two: " +num);

        num= scan.nextInt();

        if(num!=0 && (num & (num-1))==0){
            System.out.println(true);
        }
        else{

            System.out.println(false);
        }


    }
}
