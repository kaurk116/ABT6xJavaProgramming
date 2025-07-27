package JavaProgramming;

public class FindMaxNumInArray {
    public static void main(String[] args) {
        int [] salary={100,30,50,90,80,999,30};
        int max_salary= Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            if(salary[i]>max_salary){
           max_salary=salary[i];

}
    }
        System.out.println(max_salary);
}
}