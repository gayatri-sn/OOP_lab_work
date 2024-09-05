import java.util.*;
class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        //Reading the matrix
        System.out.println("Enter elements of matrix:");
        int mat[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]= sc.nextInt();
            }
        }

        //Sum of non principal diagonal elements
        int sum = 0;
        System.out.println("Non diagonal elements are: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i!=j){
                    System.out.print(mat[i][j]);
                    System.out.print(" ");
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Sum of non diagonal elements = ");
        System.out.print(sum);
        sc.close();

    }
}
