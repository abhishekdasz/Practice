public class FreqOfElement 
{
    public void countFreq(int arr[])
    {
        boolean visited [] = new boolean[arr.length];
        for(int i= 0; i<arr.length; i++)
        {
            if(visited[i] == true)
            {
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] == arr[i])
                {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }
    public static void main(String[] args) 
    {
        int arr [] = {10,5,10,15,10,5};
        FreqOfElement f = new FreqOfElement();
        f.countFreq(arr);
    }    
}
