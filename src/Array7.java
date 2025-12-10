import java.util.Scanner;

public class Array7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt(); // taking the user input from the user of size
        int arr[] = new int[size]; // instantiation of the array with size
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) // taking the user input , always we should use for loop
        {
            arr[i] = sc.nextInt(); // accepting the user input
        }
        System.out.println("The elements of the array are");
        for (int i = 0; i < arr.length; i++) // printing the elements with this for loop
        {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
        int sum = 0;
        for(int j=0;j<arr.length;j++)
        {
            sum += arr[j]; // sum
        }
        System.out.println("The sum of the elements of the array are : " +sum);
        int avg =  sum/arr.length;
        System.out.println("The average of the elements of the array are : " +avg);
    }
}
