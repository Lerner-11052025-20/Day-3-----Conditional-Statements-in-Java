public class ShortSwichCaseStatement
{
    public static void main(String args[])
    {
        char ch = 99; // value is 'c'
        System.out.println(ch);
        
        switch(ch) // break; included chhe pan aama chhe -> ohk
        {
            case 'a' -> System.out.println(97);
            case 'b' -> System.out.println(98);
            case 'c' -> System.out.println(99);
            case 'z' -> System.out.println(122);
            case 'Z' -> System.out.println(90);
            default -> System.out.println("enter corrrect please!!!");
        }
    }
}
