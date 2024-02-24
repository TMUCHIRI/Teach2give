//Question 1: FizzBuzz
//Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
//multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
//"FizzBuzz"

public class Fizzbuzz {

    public static void main (String [] args){

            for (int i = 1; i <= 100; i++) {
                    String output = "";
                    if (i % 3 == 0) {
                        output = output + "Fizz";
                    }
                    if (i % 5 == 0) {
                        output += "Buzz";
                    }
                    if (output.isEmpty()) {
                        output = String.valueOf(i);
                    }
                    System.out.println(output);
                }
            }
        }



