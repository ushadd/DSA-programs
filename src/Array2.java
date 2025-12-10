import java.util.Scanner;

public class Array2
{
    public static void main(String args[])
    {
        int array[] = {5,8,9,3,9};
        array[2] = 1; // changing the values in array by using index
        for(int i = 0;i<array.length;i++)
            {
            System.out.println(array[i]);
            }
    }

}
