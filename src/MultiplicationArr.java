import java.util.Scanner; // interview question

public class MultiplicationArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and colms of 1st matrix ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the rows and colms of 2nd matrix ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] A=new int[r1][c1]; // array declaration
        int[][] B=new int[r2][c2];
        int[][] C=new int[r1][c2];
        System.out.println("Enter the elements of 1st the matrix ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd the matrix ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication of two matrices");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                C[i][j] = 0; //assigning 0 when we dont know the value of C
                for(int k=0;k<r2;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
