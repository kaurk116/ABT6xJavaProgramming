package JavaProgramming;

import java.util.Scanner;

public class Negitive_Positive_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("Number is Positive");

        } else if (number < 0) {
            System.out.println("Number is Negitive");

        } else {
            System.out.println("number zero");
        }
    }
}
