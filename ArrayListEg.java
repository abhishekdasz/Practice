import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEg 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        // update
        list.set(0, 50);
        System.out.println(list);
        // contains
        System.out.println(list.contains(60));

        ArrayList<Integer> list2 = new ArrayList<>(10);
        for(int i=0; i<5; i++)
        {
            list2.add(sc.nextInt());
        }
        for(int i=0; i<5; i++)
        {
            System.out.println(list2.get(i));
        }
    }    
}
