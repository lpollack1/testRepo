import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        // added comment for lab 6
        
        Scanner sc = new Scanner(System.in);

        // name input
        String name = sc.next();

        // age input
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        String age = sc.next();

        // hometown input
        System.out.print("I see that you are still quite young at only " + age + ".\nWhere do you live? ");
        String home = sc.next();

        System.out.println("Wow! I've always wanted to go to " + home + ". Thanks for chatting with me. Bye!");
    }
}



