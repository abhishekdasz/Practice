class Smallest 
{
    public int findSmallest(int arr[])
    {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(smallest > arr[i])
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) 
    {
        int arr [] = {3,4,1,2,5};
        Smallest s = new Smallest();
        System.out.println(s.findSmallest(arr));
    }
}