import java.util.Scanner;

public class MulArray1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and colms ");
        int r=input.nextInt();
        int c = input.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("the elements of the array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
           {
             System.out.print(array[i][j]+" ");
           }
        System.out.println();
        }
    }
}
