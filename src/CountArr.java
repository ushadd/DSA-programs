import java.util.Scanner;

public class CountArr
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < length; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element which u need");
        int element = input.nextInt();
        int count = 0; // when we dont know the count initilize 0
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] ==element)
            {
                count++;
            }
        }
        System.out.println(element +" is repeated " +count+ " times");
    }
}
