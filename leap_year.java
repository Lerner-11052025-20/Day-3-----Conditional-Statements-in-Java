import java.util.Scanner;
public class leap_year
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if(year%4 == 0)
        {
            System.out.println("Your entered year "+year+" is an LEAP YEAR");
        }
        else
        {
            System.out.println("Your entered year "+year+" is NOT an leap year");
        }
    }  
}