package JavaProgramming;

public class ForLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("The value is  " + i);
            if (i == 5) {
                break;
            }
        }
            //System.out.println("The value is  " +i);
            System.out.println("End");
    }
}
