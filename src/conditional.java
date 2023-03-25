import java.util.*;
class conditional{
    public static void main(String[] args)
    {
        // WRITE A PROGRAM TO CHECK CONDITION:
        // a==b print ( a is equal to b)
        // a>b print ( a is greater than b)
        // a<b print ( b is greater than a)

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("a is equal to b");
        }
        else if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }
    }
}