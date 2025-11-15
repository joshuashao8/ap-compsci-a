import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
        // Start here!
        Scanner input = new Scanner(System.in);
           System.out.println("Enter movie rating (as a decimal)");
        double rating = input.nextDouble();

        // Rounding with casting:
        int rounded = (int) (rating + 0.5);

        System.out.println("Rating rounded: " + rounded);

        }
        // input.close();

    }
}
