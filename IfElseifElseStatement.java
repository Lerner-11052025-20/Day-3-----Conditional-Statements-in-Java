public class IfElseifElseStatement
{
    public static void main(String args[])
    {
        int a = 1;
        if(a >= 18 && a <= 25)
        {
            System.out.println("Adult");
        }
        else if(a >= 13 && a < 18)
        {
            System.out.println("Tinager");
        }
        else if(a >= 5 && a < 13)
        {
            System.out.println("Moj karva vala balko");
        }
        else
        {
            System.out.println("kay nathi khabar padti teva balko");
        }        
    }
}
