import java.util.Scanner;
public class even_odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //if Statement
        if(a % 2 == 0)    System.out.println("EVEN");
        else    System.err.println("ODD");
    }
}