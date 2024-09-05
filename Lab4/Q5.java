import java.util.*;
class Q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of first matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        //Reading the matrix
        System.out.println("Enter elements of first matrix:");
        int mat[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]= sc.nextInt();
            }
        }
        int PDsum = 0, NPDsum = 0;
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(i==j){
                    PDsum += mat[i][i];
                    NPDsum += mat[i][row - 1 -i];
                }
            }
        }
        if(NPDsum != PDsum){
            System.out.println("Given matrix is not a magic square");
            System.exit(0);
        }

        int rowsum = 0,colsum = 0;
        for(int i=0;i<row;i++){
            rowsum = 0;
            colsum = 0;
            for(int j=0;j<col;j++){
                rowsum += mat[i][j];
                colsum += mat[j][i];
            }
            if(rowsum != colsum || colsum != PDsum){
                System.out.println("Given matrix is not a magic square");
                System.exit(0);
            }
        }
        System.out.println("Given matrix is a magic square");
        sc.close();
    }
}
