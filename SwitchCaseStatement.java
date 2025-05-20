public class SwitchCaseStatement
{
    public static void main(String args[])
    {
        char ch = 99; // value is 'c'
        System.out.println(ch);
        
        switch(ch)
        {
            case 'a' :
                System.out.println(97);
                break;
            case 'b' :
                System.out.println(98);
                break;
            case 'c' :
                System.out.println(99);
                break;
            case 'z' :
                System.out.println(122);
                break;
            case 'Z' :
                System.out.println(90);
                break;
            default :
                System.out.println("enter corrrect please!!!");
        }
    }
}
