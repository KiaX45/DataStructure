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
        //La O grande de este algoritmos es: 3n + 6 = (O^n)
        int dividend = (int) (Math.random() * 100 + 1);   //1
        System.out.println(dividend);                     //1
        int divider = (int) (Math.random() * 100 + 1);    //1
        int result = 0;                                   //1
        boolean continuar = true;                         //1
        do {
            if (dividend > divider) {                    //n
                dividend -= divider;                     //n
                result++;                                //n
            } else continuar = false;                    //1

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
        //La O grande de este algoritmo es: 5n^3 + 3n^2 + 10n + 5 = O(n^3)
        int count = 0;                                            //1
        int repeticions = 0;                                      //1
        boolean repeticion = false;                               //1
        String answer = "";                                       //1
        Scanner scanner = new Scanner(System.in);                 //1
        do {
            repeticions = 0;                                      //n
            System.out.println("Please inset the characters");    //n
            String characters = scanner.nextLine();               //n
            System.out.println("Please inset the word");          //n
            String word = scanner.nextLine();                     //n
            for (int i = 0; i < word.length(); i++) {
                int z = i;                                        //n^2
                count = 0;                                        //n^2
                for (int j = 0; j < characters.length(); j++) {
                    String letter = "";                           //n^3
                    try {
                        letter = String.valueOf(word.charAt(z));  //n^3
                    } catch (Exception e) {

                    }
                    String comparation = String.valueOf(characters.charAt(j)); //n^3
                    if (letter.equalsIgnoreCase(comparation)) {
                        count++;                                   //n^3
                        z++;                                       //n^3
                    } else {
                        j = word.length();                         //n^3
                    }
                }
                if (count == characters.length()) {
                    repeticions++;                                 //n^2
                }
            }

            System.out.println("The number of times that " + characters + " it is in " + word + " is: " + repeticions);  //n
            System.out.println("Do you want to repeat?");                                                                //n
            answer = scanner.nextLine();                                                                                 //n
            if (answer.equalsIgnoreCase("yes")) {
                repeticion = true;                                                                                       //n
            } else repeticion = false;                                                                                   //n

        } while (repeticion);


    }

    private static void fifth() {
        //La O grande de este lgoritmo es: 9n^2 + 5n + 4 = O(n^2)
        Scanner scanner = new Scanner(System.in);                               //1
        boolean repeticion = false;                                             //1
        String answer = "";                                                     //1
        int number = 0;                                                         //1
        do {
            do {
                System.out.println("Please inser the number ");                 //n^2
                try {
                    number = scanner.nextInt();                                 //n^2
                    repeticion = false;                                         //n^2
                } catch (Exception e) {                                         //n^2
                    System.out.println("The value must be numeric");            //n^2
                    repeticion = true;                                          //n^2
                }
                scanner.nextLine();                                             //n^2
            } while (repeticion);

            int count = 0;                                                      //n
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {                                          //n^2
                    count++;                                                    //n^2
                }
            }

            if (count > 2) {
                System.out.println("The number " + number + " it is not a prime number"); //n
            } else System.out.println("The number " + number + " it is a prime number");  //n


            System.out.println("Do you want to repeat?");                                 //n

            answer = scanner.nextLine();                                                  //n


            if (answer.equalsIgnoreCase("yes")) {
                repeticion = true;                                                         //n
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
