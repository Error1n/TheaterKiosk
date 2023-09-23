import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); //clears buffer
            if (age >= 21)
            {
                System.out.println("You get a wrist band!");
            }
        }
    }
}