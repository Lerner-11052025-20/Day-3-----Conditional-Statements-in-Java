import java.util.Scanner;
public class table
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i=1 ; i<=a ; i++)
        {
            for(int j=1 ; j<=10 ; j++)
            {
                System.out.println(i+" * "+j+ " = "+(i*j) );
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}