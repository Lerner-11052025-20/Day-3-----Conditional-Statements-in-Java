import java.util.Scanner;
public class Absolute
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want : ");
        int n = sc.nextInt();
        
        if(n<0)
        {
            System.out.println("your number's "+n+" ABSOLUTE value is : " + (n*(-1)) );
        }
        else
        {
            System.out.println("your number is : "+n);
        }        
    }
}
