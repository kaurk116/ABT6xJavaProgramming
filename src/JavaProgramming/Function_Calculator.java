package JavaProgramming;

import java.util.Scanner;

public class Function_Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1 =sc.nextInt();
        System.out.println("Enter the number 1");
        int number2 =sc.nextInt();
        int result_sum =number_sum(number1,number2);
        System.out.println(result_sum);

        int result_sub =number_sub(number1,number2);
        System.out.println(result_sub);

        int result_mul =number_Mul(number1,number2);
        System.out.println(result_mul);

        int result_div=number_Div(number1,number2);
        System.out.println(result_div);

    }
    static  int number_sum(int a ,int b){
        return a +b;
    }
    static  int number_sub(int a ,int b) {
        return a - b;
    }

    static  int number_Mul(int a ,int b) {
        return a * b;
    }

    static  int number_Div(int a ,int b) {
        return a/b;
    }
}
