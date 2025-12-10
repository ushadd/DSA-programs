public class Array5
{
    public static void main(String[] args)
    {
        char arr[] = {'u','s','h','a'};
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]);
        }
        System.out.println();
        arr[3]='u';
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]);
        }
    }
}
