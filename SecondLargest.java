public class SecondLargest 
{
    public int secondLargest(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        int seLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > largest)
            {
                seLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > seLargest && arr[i] != largest)
            {
                seLargest = arr[i];
            }
        }
        return seLargest;
    }
    public static void main(String[] args) 
    {
        int arr [] = {1,2,8,4,5};
        SecondLargest s = new SecondLargest();
        System.out.println(s.secondLargest(arr));
    }    
}
