package JavaProgramming;

import java.util.Scanner;

public class ArrayScanerforLoopifCondition {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks [] =new int[5];
        System.out.println("Enter the marks subject 1");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks subject 2");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks subject 3");
        marks[2]=sc.nextInt();
        System.out.println("Enter the marks subject 4");
        marks[3]=sc.nextInt();
        System.out.println("Enter the marks subject 5");
        marks[4]=sc.nextInt();
        for (int i = 0; i < marks[i]; i++) {
            if (marks[i]<=30){
                System.out.println("Fail in this subject" +marks[i]);
            }
            System.out.println(marks[i]);

        }
    }
}
