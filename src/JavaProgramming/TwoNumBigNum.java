package JavaProgramming;

import java.util.Scanner;

public class TwoNumBigNum {
    public static void main(String[] args) {
        System.out.println("enter the num1");
        Scanner sc =new Scanner(System.in);
        int num1 =sc.nextInt();

        System.out.println("enter the num2");
        int num2=sc.nextInt();
        if(num1 > num2) {
            System.out.println("number max----" +num1);
        }else {
            System.out.println("number max----" +num2);
        }
    }
}
