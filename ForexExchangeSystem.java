import java.util.Scanner;

public class ForexExchangeSystem {


    private static final int NUM_CURRENCIES = 5;
    private static final int NUM_DAYS = 5;
    private static final String[] CURRENCIES = {"USD", "EUR", "JPY", "GBP", "AUD"};


    private static double[][] exchangeRates = new double[NUM_CURRENCIES][NUM_DAYS];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       FOREX EXCHANGE RATE INPUT SYSTEM (Day 1-5) ");
        System.out.println("==================================================");


        inputExchangeRates();


        displayForexSummary();


        displayDailyChanges();

        scanner.close();
    }

    
        private static void inputExchangeRates() {
             for (int i = 0; i < NUM_CURRENCIES; i++) {
               System.out.println("\n--- Entering Rates for Currency: " + CURRENCIES[i] + " ---");
             for (int j = 0; j < NUM_DAYS; j++) {

                double rate = -1;
                while (rate <= 0) {
                    try {
                        System.out.print(CURRENCIES[i] + " Rate on Day " + (j + 1) + ": ");
                        rate = scanner.nextDouble();
                        if (rate <= 0) {
                             System.out.println("Error: Rate must be a positive number.");
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Error: Invalid input. Please enter a number.");
                        scanner.next(); 
                    }
                }
                exchangeRates[i][j] = rate;
            }
        }
    }

    
        private static void displayForexSummary() {
        System.out.println("\n==========================================================================");
        System.out.println("                            FOREX SUMMARY (Day 1 - Day 5)");
        System.out.println("==========================================================================");


        System.out.print("Currency |");
        for (int j = 0; j < NUM_DAYS; j++) {
            System.out.printf("  Day %d  |", j + 1);
        }
        System.out.println("  Peak  | Lowest |");
        

        System.out.println("--------------------------------------------------------------------------");


        for (int i = 0; i < NUM_CURRENCIES; i++) {
            double peakRate = exchangeRates[i][0];
            double lowestRate = exchangeRates[i][0];

            System.out.printf("%-8s |", CURRENCIES[i]);


            for (int j = 0; j < NUM_DAYS; j++) {
                double rate = exchangeRates[i][j];
                System.out.printf("%7.2f |", rate);


                if (rate > peakRate) {
                    peakRate = rate;
                }
                if (rate < lowestRate) {
                    lowestRate = rate;
                }
            }


            System.out.printf("%7.2f |%7.2f |\n", peakRate, lowestRate);
        }
        System.out.println("==========================================================================");
    }

    
        private static void displayDailyChanges() {
        System.out.println("\n=== DAILY CHANGES (Comparison From Previous Day) ===");
        System.out.println("(+ increase / - decrease / No Change for same value)");


        for (int i = 0; i < NUM_CURRENCIES; i++) {
            System.out.println("\nCurrency: " + CURRENCIES[i]);


            for (int j = 1; j < NUM_DAYS; j++) {
                double previousRate = exchangeRates[i][j - 1];
                double currentRate = exchangeRates[i][j];
                

                double change = currentRate - previousRate;

                System.out.print("Day " + j + " -> Day " + (j + 1) + ": ");


                if (change > 0) {
                    System.out.printf("+ %.2f\n", change);
                } else if (change < 0) {
                    System.out.printf("- %.2f\n", Math.abs(change));
                } else {
                    System.out.println("No Change");
                }
            }
        }
    }
}
