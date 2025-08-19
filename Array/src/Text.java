import java.util.Random;

public class Text {
    public static void main(String[] args) {
        //Java的二维数组不对齐，可动态分配为int[2][]，列先不管，也可int[][]
        int[][] arr1 = new int[9][10];
        Random r = new Random();
        for(int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = r.nextInt(100);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
