package JavaProgramming;

import java.util.Scanner;

public class StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String text = sc.nextLine();
        StringBuilder stringBuilder =new StringBuilder(text);
        String reverse_line = stringBuilder.reverse().toString();
        System.out.println(reverse_line);


}
}