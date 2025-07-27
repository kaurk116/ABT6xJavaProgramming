package JavaProgramming;

public class Function_ReturnWith_Parameters {
    public static void main(String[] args) {

        //return with parameters
        int sum = sumofNumber(5,6);
        System.out.println(sum);
        int sum2 = sumofNumber(15,16);
        System.out.println(sum2);

        String name = sumofNumber("karamjeet" ,"saini");
        System.out.println(name);
    }

    static int sumofNumber(int a, int b){
        return a+b;
    }

    static String sumofNumber(String a, String b){
        return a +b ;
    }
}
