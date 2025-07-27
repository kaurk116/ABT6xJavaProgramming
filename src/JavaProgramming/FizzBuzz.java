package JavaProgramming;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();*/
         //int number =100;
        for (int i = 3; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz: "+i);

            } else if (i % 3 == 0) {
                System.out.println("fizz: " +i);

            } else if (i % 5 == 0) {
                System.out.println("Buzz: " +i);

            } else {
                System.out.println("Normal Number: " +i);

            }
        }
    }
}
