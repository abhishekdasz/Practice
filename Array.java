import java.util.Scanner;

public class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[5];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }  
        System.out.println("The entered array is:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }  
    }    
}
