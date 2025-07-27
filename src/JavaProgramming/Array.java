package JavaProgramming;

public class Array {
    public static void main(String[] args) {
        int [] age=new int[5];
        age[0]=30;
        age[1]=31;
        age[2]=33;
        age[4]=34;
        System.out.println(age);
        System.out.println(age[0]);
        System.out.println(age.length);

        int [] number =new int[5];
        number[0]=30;
        number[1]=31;
        number[2]=33;
        number[4]=34;
        System.out.println(age==number);



        int marks [] ={12,23,34,55};
        int marks1[] =marks;
        System.out.println(marks1==marks);


    }
}
