import java.util.*;
public class switchprob
{
    // write a program for calculator...!!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String button = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(button)
        {
            case ("+"):
                System.out.println("addition is:"+(a+b));
                break;
            case ("-"):
                System.out.println("subtraction is:"+(a-b));
                break;
            case ("*"):
                System.out.println("multiplication is:"+(a*b));
                break;
            case ("/"):
                System.out.println("division is:"+(a/b));
                break;
            case ("%"):
                System.out.println("modulus is:"+(a%b));
                break;
            default:
                System.out.println("sorry..!! invalid button..");

        }
    }
}

