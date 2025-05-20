public class TernaryOperator
{
    public static void main(String[] args) {
        int a = 0 , b= 10;
        
        int ans = (a>b) ? a : b ;
        System.out.println(ans);

        System.out.println( ((a>b) ? a : b)  );

        if(a>0) System.out.println("+ve");
        else    System.out.println("-ve or 0");
    }
}
