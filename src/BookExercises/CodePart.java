package BookExercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CodePart {

    public static void main(String[] args) {
        //first();
        //second();
        //fourth();
        //fifth();
        //seventh();
        //eighth();
        nineth();

    }


    public static void first() {
        //calcular el cociente de dos numero enteros
        int dividend = (int) (Math.random() * 100 + 1);
        System.out.println(dividend);
        int divider = (int) (Math.random() * 100 + 1);
        int result = 0;
        boolean continuar = true;
        do {
            if (dividend > divider) {
                dividend -= divider;
                result++;
            } else continuar = false;

        } while (continuar);

        System.out.println("The number of times that " + (divider * result + dividend) + " can be divided between " + divider + " is: " + result);

    }

    public static void second() {
        int firstNumber = (int) (Math.random() * 100 - 100);
        int secondNumber = (int) (Math.random() * 100 - 100);
        int result = 0;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        firstNumber = firstNumber * -1;
        secondNumber = secondNumber * -1;

        for (int i = 0; i < secondNumber; i++) {
            result += firstNumber;
        }

        System.out.println(" the resul of the multiplication between " + secondNumber + " and " + firstNumber + " is: " + result);
    }

    public static void fourth() {
        int count = 0;
        int repeticions = 0;
        boolean repeticion = false;
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        do {
            repeticions = 0;
            System.out.println("Please inset the characters");
            String characters = scanner.nextLine();
            System.out.println("Please inset the word");
            String word = scanner.nextLine();
            for (int i = 0; i < word.length(); i++) {
                int z = i;
                count = 0;
                for (int j = 0; j < characters.length(); j++) {
                    String letter = "";
                    try {
                        letter = String.valueOf(word.charAt(z));
                    } catch (Exception e) {

                    }
                    String comparation = String.valueOf(characters.charAt(j));
                    if (letter.equalsIgnoreCase(comparation)) {
                        count++;
                        z++;
                    } else {
                        j = word.length();
                    }
                }
                if (count == characters.length()) {
                    repeticions++;
                }
            }

            System.out.println("The number of times that " + characters + " it is in " + word + " is: " + repeticions);
            System.out.println("Do you want to repeat?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                repeticion = true;
            } else repeticion = false;

        } while (repeticion);


    }

    private static void fifth() {
        Scanner scanner = new Scanner(System.in);
        boolean repeticion = false;
        String answer = "";
        int number = 0;
        do {
            do {
                System.out.println("Please inser the number ");
                try {
                    number = scanner.nextInt();
                    repeticion = false;
                } catch (Exception e) {
                    System.out.println("The value must be numeric");
                    repeticion = true;
                }
                scanner.nextLine();
            } while (repeticion);

            int count = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            if (count > 2) {
                System.out.println("The number " + number + " it is not a prime number");
            } else System.out.println("The number " + number + " it is a prime number");


            System.out.println("Do you want to repeat?");

            answer = scanner.nextLine();


            if (answer.equalsIgnoreCase("yes")) {
                repeticion = true;
            } else repeticion = false;

        } while (repeticion);


    }

    private static void seventh() {
        Scanner scanner = new Scanner(System.in);
        boolean repetition = false;
        String answer = "";
        float base, height, result;
        base = 0;
        height = 0;
        do {
            do {
                try {
                    System.out.println("Please enter the base");
                    base = scanner.nextInt();
                    System.out.println("Please enter the height");
                    height = scanner.nextInt();
                    repetition = false;
                } catch (Exception e) {
                    System.out.println("The value must be numeric");
                    repetition = true;
                }
                scanner.nextLine();
            } while (repetition);

            result = (base * height) / 2;

            System.out.println("The surface is: " + result);
            System.out.println("Do you want to repeat?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                repetition = true;
            } else repetition = false;
        } while (repetition);

    }

    private static void eighth() {
        Scanner scanner = new Scanner(System.in);
        boolean repetition = false;
        String answer = "";
        float result, radius;
        radius = 0;
        do {
            do {
                try {
                    System.out.println("Please enter the radius");
                    radius = scanner.nextFloat();
                    repetition = false;
                } catch (Exception e) {
                    System.out.println("The radius must be numeric");
                    repetition = true;
                }
                scanner.nextLine();
            } while (repetition);

            result = (float) (Math.PI * (radius * 2));
            System.out.println("the circumference length is: " + result);
            result = (float) (Math.PI * (Math.pow(radius, 2)));
            System.out.println("the circumference area is: " + result);
            System.out.println("Do you want to repeat?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                repetition = true;
            } else repetition = false;
        } while (repetition);

    }

    private static void nineth() {
        Scanner scanner = new Scanner(System.in);
        boolean repetition = false;
        String answer = "";
        do {
            System.out.println("Please write word do you want to test ");
            String word =scanner.nextLine();
            String word1 = word;
            word = word.replace(" ", "");
            String backwards = "";
            for (int i = word.length(); i > 0; i--) {
                backwards += word.charAt(i - 1);
            }
           // System.out.println(backwards);
            if (word.equalsIgnoreCase(backwards)) {
                System.out.println("The word " + word1 + " is a palindrome");
            } else {
                System.out.println("The word " + word1 + " is not a palindrome");
            }
            System.out.println("Do you want to repeat?");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                repetition = true;
            } else repetition = false;
        } while (repetition);

    }


}
