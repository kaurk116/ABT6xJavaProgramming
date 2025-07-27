package JavaProgramming;

public class MaxNum2DArray {
    public static void main(String[] args) {
        int array [][]={
                {2,3,4},
                {3,4,6},
                {7,6,3}
        };
             int max =array[0][0];
             for (int i = 0; i <array.length ; i++) {
                 for (int j = 0; j < array[i].length; j++) {
                     if (array[i][j] >= max) {
                         max = array[i][j];

                     }
                 }
             }
        System.out.println("Maximum Number" +max);
        }
    }
