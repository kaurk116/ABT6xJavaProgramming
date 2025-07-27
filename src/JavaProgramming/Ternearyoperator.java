package JavaProgramming;

import java.util.Scanner;

public class Ternearyoperator {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
       /* Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();*/
        int num1 =30;
        int num2 =20;
        int max = num1 > num2 ? num1 :num2;
        int min =num1< num2 ? num1 : num2;

        System.out.println(max);
        System.out.println(min);

    }
}
