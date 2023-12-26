import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int rows = 3;
        int cols = 4;
        for(int i=0; i<rows; i++)
        {
            ArrayList<Integer> rowList = new ArrayList<>();
            for(int j=0; j<cols; j++)
            {
                rowList.add(sc.nextInt());
            }
            list.add(rowList);
        }
        System.out.println(list);
    }   
}
