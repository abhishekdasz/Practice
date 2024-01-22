public class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        int num = 25;
        int reme [] = new int[100];
        int i = 0;
        while(num != 0)
        {
            reme[i] = num % 2;
            num = num/2;
            i++;
        } 
        for(int j=i-1; j>=0; j--)
        {
            System.out.println(reme[j]);
        }   
    }    
}
