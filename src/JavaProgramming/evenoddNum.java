package JavaProgramming;

import java.util.Scanner;

public class evenoddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else if (number % 2 == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("zero");
        }
    }
}
