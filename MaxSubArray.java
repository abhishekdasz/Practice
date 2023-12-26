class MaxSubArray
{
    public static void main(String[] args) 
    {
        int arr [] = { -5,4,6,-3,4,-1 };

        int maxSum = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            int sum = 0;
            for(int j=i; j<arr.length-1; j++)
            {
                sum = sum + arr[j];
            }
            if(sum>maxSum)
            {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}