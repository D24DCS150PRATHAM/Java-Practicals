import java.util.*;
    public class p4
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of days: ");
            int numDays = sc.nextInt();

            double[] dailyExpenses = new double[numDays];
            for (int i = 0; i < numDays; i++)
            {
                System.out.printf("Enter expense for day %d: ", i + 1);
                dailyExpenses[i] = sc.nextDouble();
            }

            double totalExpenses = calculateTotalExpenses(dailyExpenses);
            System.out.printf("Total expenses for the month: %.2f CAD%n", totalExpenses);
        }

        public static double calculateTotalExpenses(double[] dailyExpenses) {
            double total = 0.0;
            for (double expense : dailyExpenses)
            {
                total += expense;
            }
            return total;
        }
    }
