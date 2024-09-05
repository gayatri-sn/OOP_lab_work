import java.util.*;
class Q3{
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

        //Checking if Symmetric 
        boolean notSym = false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=mat[j][i]){
                    notSym = true;
                    break;
                }
            }
        }
        if(notSym==true){
            System.out.println("Matrix is not symmetric");
        }
        else{
            System.out.println("Matrix is symmetric");
        }
        sc.close();
    }
}