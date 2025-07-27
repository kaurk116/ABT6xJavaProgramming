package JavaProgramming;

import java.util.Scanner;

public class ThreeNumLarge_TernearyOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 = sc.nextInt();
        System.out.println("Enter the number2");
        int number2 = sc.nextInt();
        System.out.println("Enter the number3");
        int number3 = sc.nextInt();

        int A = ((number1>number3) ? number1 :number3);
        int b = ((number2>number3)? number2 :number3);
        int largeNum =((number1>number2) ? A: b);
        System.out.println(largeNum);
    }

}
