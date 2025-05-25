import java.util.Scanner;

public class gratestof3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a +" is GREATEST");
            }
            else
            {
                System.out.println(c + " is GREATEST");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b + " is GREATEST");
            }
            else
            {
                System.out.println(c + " is GREATEST");
            }
        }




    }
}