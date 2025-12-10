public class MulArray
{
    public static void  main(String[] args)
    {
        int[][] arrary = {
                {2, 9, 8},
                {7, 5, 3},
                {6, 9, 2}
        };
        for(int i =0;i<3;i++) // printing the taken array in matrix form
        {
            for(int j =0;j<3;j++)
            {
                System.out.print(arrary[i][j]+" "); // "" used for giving space b/w the numbers in output
            }
            System.out.println();
        }
    }
}
