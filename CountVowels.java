//Question 6: Count Vowels
//Write a program that counts the number of vowels in a sentence.
//eg " Hello World " => returns 2
//SUCCESS CHAMPS!!

import java.util.Scanner;

public class CountVowels {

    public static int counterVowels(String sentence){

        if(sentence == null || sentence.isEmpty()){
            return 0;
        }
        int count = 0;
        sentence = sentence.toLowerCase();
        for( int i = 0 ; i < sentence.length() ; i++) {

            char c = sentence.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String [] args){
Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string to count vowels: ");

        String sentence = scan.nextLine();
        int vowelCount = counterVowels(sentence);

        System.out.println("The number of vowels in the sentence is: "+vowelCount);


    }

}
