package JavaProgramming;

import java.util.Scanner;

public class ArthmaticOperator_switchCase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 =sc.nextInt();
        System.out.println("Enter the number2");
        int number2 =sc.nextInt();
        System.out.println("What do you want from +, -,*,/");
        char  ch=sc.next().charAt(0);

        int add =number1 + number2;
        int sub =number1-number2;
        int multiple =number1*number2;
        double div =number1/number2;

        switch (ch) {
            case '+':
                System.out.println("Number Added is" + add);
                break;
            case '-':
                System.out.println("Numbers Substract" + sub);
                break;
            case '*':
                System.out.println("Number is multiple" + multiple);
                break;
            case '/':
                System.out.println("Number is multiple" + div);
                break;
            default:
                System.out.println("You are god");

        }

    }
}
