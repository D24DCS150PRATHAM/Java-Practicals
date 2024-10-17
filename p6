import java.util.Scanner;

    public class p6
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of days for your exercise routine: ");
            int n = sc.nextInt();

            if (n <= 0)
            {
                System.out.println("Please enter a positive integer.");
            }
            else
            {
                System.out.println("Exercise durations for each day:");
                int a = 50, b = 20;
                for (int i = 1; i <= n; i++)
                {
                    System.out.printf("Day %d: %d minutes%n", i, a);
                    int nextTerm = a + b;
                    a = b;
                    b = nextTerm;
                }
            }

        }
    }
