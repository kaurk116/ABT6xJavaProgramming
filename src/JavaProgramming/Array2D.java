package JavaProgramming;

public class Array2D {
    public static void main(String[] args) {
        int array [][]={
                {2,3,4},
                {3,4,6},
                {7,6,3}
        };
        System.out.println(array);
        System.out.println(array.length);

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array[i][j]);
                // System.out.println(array[1][1]);

            }
        }

        System.out.println(array[0][0]);

    }
}
