import java.util.*;
class Q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of first matrix:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.println("Enter number of rows and columns of second matrix:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        if(col2 != row1){
            System.out.println("Matrices cannot be multiplied!!");
        }

        //Reading the matrix
        System.out.println("Enter elements of first matrix:");
        int mat1[][] = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                mat1[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        int mat2[][] = new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                mat2[i][j]= sc.nextInt();
            }
        }

        int mat3[][] = new int[row1][col2];
        int mat4[][] = new int[row2][col1];

        //Adding the matrices
        for(int i=0;i<row1;i++){
            for(int j=0;j<row2;j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //Multiply the matrices
        for(int i=0;i<row2;i++){
            for(int j=0;j<col1;j++){
                for(int k = 0;k<col2;k++){
                mat4[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        //Display sum matrix
        System.out.println("Sum matrix = ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(mat3[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        //Display product matrix
        System.out.println("Product matrix = ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col1;j++){
                System.out.print(mat4[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
