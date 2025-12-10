public class SecondLargNumArray
{
    public static void main(String[] args)
    {
        int array[] = {7,9,8,5,4,15,32};
        int large_num = array[0]; // assuming the first num is large
        for(int i =1;i<array.length;i++)
        {
            if(array[i]>large_num)
            {
                large_num = array[i];
            }
        }
        System.out.println("Large num is "+large_num);
        int second_large_num =array[0];
        for(int i =1;i<array.length;i++)
        {
            if(large_num!=array[i])
            {
                second_large_num = array[i];
            }
        }
        System.out.println("Second large num is "+second_large_num);
    }
}
