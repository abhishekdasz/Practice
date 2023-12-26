import java.util.Scanner;

public class Input 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.next();
        System.out.println("Your Name is:"+name);    
    }    
}
