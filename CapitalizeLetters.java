//Question 4: Capitalize Words
//Write a program that accepts a string as input, capitalizes the first letter of each word in the
//string, and then returns the result string.

import java.util.Scanner;

    public class CapitalizeLetters {

        public static String capitalizeWords(String str) {
            if (str == null || str.isEmpty()) {
                return str;
            }

            String[] words = str.split("\\s");
            StringBuilder capitalized = new StringBuilder();

            for (String word : words) {
                if (!word.isEmpty()) {
                    capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
                }
                capitalized.append(" ");
            }

            return capitalized.toString().trim();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String result = capitalizeWords(input);
            System.out.println("Capitalized string: " + result);

            scanner.close();
        }
    }




