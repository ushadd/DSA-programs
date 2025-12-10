public class Array4
{
    public static void main(String[] args)
    {
        int arr[] = {2,5,6,8,1,3};
        int small_num = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<small_num)
            {
                small_num = arr[i];
            }

        }

        System.out.println("\n Smallest number = "+small_num);
    }

}
