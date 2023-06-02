import java.io.IOException;
import java.util.Scanner;

public class UserInputBetterWay 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number...");

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println(num);
        }
        
    }
}
