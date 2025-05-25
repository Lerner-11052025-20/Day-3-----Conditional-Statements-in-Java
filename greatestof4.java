import java.util.Scanner;

public class greatestof4
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
        System.out.print("Enter the fourth number : ");
        int d = sc.nextInt();

        //ALL ARE DIFFERENT TO EACH OTHER
        if(a>b && a>c && a>d)
        {
            System.out.println("a is greatest");
        }
        else if(b>a && b>c && b>d)
        {
            System.out.println("b is greatest");
        }
        else if(c>a && c>b && c>d)
        {
            System.out.println("c is the greatest");
        } 
        else if(d>a && d>b && d>c)
        {
            System.out.println("d is the greatest");
        }
        
        //ANY TWO NUMBERS ARE EQUAL TO EACH OTHER AND REMAININGS ARE DIFFERENT
        else if(a==b && a>d && a>c)
        {       
            System.out.println("a and b are equal and greater than c and d");            
        }
        else if(b==c && b>a && b>d)
        {            
            System.out.println("b and c are equal and greater than a and d");
        }
        else if(c==d && c>a && c>b)
        {            
            System.out.println("c and d are equal and greater than a and b");            
        }
        else if(a==d && a>b && a>c)
        {
            System.out.println("c and d are equal and greater than a and b");
        }

        //ANY THAREE NUMBERS ARE EQUAL TO EACH OTHER AND ONE NUMBER IS DIFFERENT
        else if(a==b && b==c && a>d)
        {
            System.out.println("a,b and c are equal to each other and greater than d");            
        }
        else if(a==b && b==d && a>c)
        {
            System.out.println("a,b and d are equal to each other and greater than c");
        }
        else if(a==c && c==d && a>b)
        {
            System.out.println("a,c and d are equal to each other and greater than b");
        }
        else if(b==c && c==d && b>a)
        {
            System.out.println("b,c and d are equal to each other and greater than a");
        }

        // ALL ARE EQUAL TO EACH OTHER
        else if(a==b && b==c && c==d && d==a)
        {
            System.out.println("a,b,c,d all are Equals");
        }
        
        
    }
}