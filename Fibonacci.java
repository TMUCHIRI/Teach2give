//Question 2: Fibonacci Sequence
//Write a program to generate the Fibonacci sequence up to 100

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int n1 = 0, n2 = 1, nextTerm;
        int num=0;

        System.out.println("Enter the number of terms: "+num);
        num= scan.nextInt();

        System.out.print("Fibonacci sequence: "+n1 +n2);
        for (int i = 3; i <= num; i++) {
            nextTerm = n1 + n2;
            System.out.print(" " + nextTerm);
            n1 = n2;
            n2 = nextTerm;
        }
    }
}