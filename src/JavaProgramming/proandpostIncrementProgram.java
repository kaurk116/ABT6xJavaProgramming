package JavaProgramming;

public class proandpostIncrementProgram {
    public static void main(String[] args) {
        System.out.println("Prefix Increment Operation");
        int a = 10;
        System.out.println(++a + ++a + ++a);
       System.out.println(a);
        System.out.println("Postfix Increment Operation");
       /* System.out.println(a++ + a++ + a++);
        System.out.println(a);*/
       System.out.println("Pre-Postfix Increment Operation");
        System.out.println(++a + a++ + a++);
       System.out.println(a);
    }

        }
