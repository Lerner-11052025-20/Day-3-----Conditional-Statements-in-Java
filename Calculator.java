import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for Continue or 0 for Exit : ");
        int num = sc.nextInt();

        while(num == 1)
        {
            // which operator you want either ARITHMETIC or BITWISE
            System.out.println("Enter which type of operation you want to perform : ");
            System.out.println("1) Arithmetic \n2) Bitwise ");
            System.out.print("Enter 1 for Arithmetic operation or 2 for Bitwise operator : ");
            int perform = sc.nextInt();

            // Arithmetic operation
            if(perform == 1)
            {
                // enter the two operand
                System.out.print("Enter the first number : ");
                float a = sc.nextInt();
                System.out.print("Enter the second number : ");
                float b = sc.nextInt();
    
                //enter the operator
                System.out.print("Enter the operator : ");
                String operator = sc.next();
            
                // calculation
                switch(operator)
                {
                case "+":
                System.out.println(a+" + "+b+" = " + (a+b) );
                break;
                case "-":
                System.out.println(a+" - "+b+" = " + (a-b) );
                break;
                case "*":
                System.out.println(a+" * "+b+" = " + (a*b) );
                break;
                case "/":
                System.out.println(a+" / "+b+" = " + (a/b) );
                break;
                case "%":
                System.out.println(a+" % "+b+" = " + (a%b) );
                break;
                case "+=":
                System.out.println(a+" += "+b+" = " + (a+=b) );
                break;
                case "-=":
                System.out.println(a+" -= "+b+" = " + (a-=b) );
                break;
                case "*=":
                System.out.println(a+" *= "+b+" = " + (a*=b) );
                break;
                case "%=":
                System.out.println(a+" %= "+b+" = " + (a%=b) );
                break;
                case "/=":
                System.out.println(a+" /= "+b+" = " + (a/=b) );
                break;
                case "++":
                System.out.println("++" +a+ " = " +(++a)+ "   ++" +b+ " = " +(++b) );
                System.out.println("++" +a+ " = " +(a++)+ "   ++"+b+" = " +(b++) );
                System.out.println(a + " " + b);
                break;                
                case "--":
                System.out.println("--"+a+" = " +(--a)+ "--"+b+" = " +(--b));
                break;                
                default :
                System.out.println("INVALID OPERATOR");
                }
            }

            // bitwise operation
            else if(perform == 2)
            {
                // enter the two operand
                System.out.print("Enter the first number : ");
                long a = sc.nextLong();
                System.out.print("Enter the second number : ");
                long b = sc.nextLong();
    
                //enter the operator
                System.out.print("Enter the operator : ");
                String operator = sc.next();
            
                // calculation
                switch(operator)
                {
                case "|":
                System.out.println(a+" | "+b+" = " + (a | b) );
                break;
                case "^":
                System.out.println(a+" ^ "+b+" = " + (a^b) );
                break;
                case "&":
                System.out.println(a+" & "+b+" = " + (a&b) );
                break;
                case "~":
                System.out.println(" ~ " +a+" = " + (~a) );
                break;
                case "|=":
                System.out.println(a+" |= "+b+" = " + (a |= b) );
                break;
                case "^=":
                System.out.println(a+" ^= "+b+" = " + (a^=b) );
                break;
                case "&=":
                System.out.println(a+" &= "+b+" = " + (a&=b) );
                break;
                case ">>":
                System.out.println(a+" >> "+b+" = " + (a>>b) );
                break;                
                case ">>=":
                System.out.println(a+" >>= "+b+" = " + (a>>=b) );
                break;                
                case "<<":
                System.out.println(a+" << "+b+" = " + (a<<b) );
                break;                
                case "<<=":
                System.out.println(a+" <<= "+b+" = " + (a<<=b) );
                break;
                case ">>>":
                System.out.println(a+" >>> "+b+" = " + (a>>>b) );
                break;                
                case ">>>=":
                System.out.println(a+" >>>= "+b+" = " + (a>>>=b) );
                break;              
                default :
                System.out.println("INVALID OPERATOR");
                }
            }

            System.out.println();
            System.out.print("Enter 1 for Continue or 0 for Exit : ");
            num = sc.nextInt();
        }

    }
}
