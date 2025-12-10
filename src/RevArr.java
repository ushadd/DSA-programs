import java.util.Scanner;

public class RevArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt(); // taking the user input from the user of size
        int arr[] = new int[size]; // instantiation of the array with size
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) // taking the user input , always we should use for loop
        {
            arr[i] = sc.nextInt(); // accepting the user input
        }
        System.out.println("The Reverse of the array ");
        for (int i = arr.length-1; i >=0 ; i--) // printing the elements with this for loop
        {
            System.out.print(arr[i] +" ");
        }

    }
}
