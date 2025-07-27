package JavaProgramming;

import java.util.Scanner;

public class SwitchMultiple_aeiou {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the charter");
        int ch=scanner.next().charAt(0);
        switch (ch){
            case 'a','e','i','o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Continent");

        }
    }
}
