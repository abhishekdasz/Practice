import java.util.Scanner;

public class TwoDArrays 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 4;
        int arr[][] = new int [row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }  
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }  
    }    
}
