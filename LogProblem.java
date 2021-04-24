import java.util.Scanner;

/**
* This is a program that displays the number of logs that should be on the truck
* considering the weight and the type(length) of the logs.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-04-22
*/

final class LogProblem {
    private LogProblem() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(final String[] args) {
        final int kgPerMeter = 20;
        final int truckMaximumWeight = 1100;
        final double logOne = 0.25;
        final double logTwo = 0.5;
        final double logThree = 1.0;
        double typetOfLog;
        double weightOfLog;
        double numberOfLogs;

        // declare input
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the length of the logs that you would "
                           + "like to move with a truck.");
        System.out.println("Enter the length of logs in meters between"
                           + "-> 0.25, 0.5, 1");

        try {
            // input
            typetOfLog = input.nextFloat();

            if ((typetOfLog == logOne) || (typetOfLog == logTwo)
                || (typetOfLog == logThree)) {
                // calculate
                weightOfLog = kgPerMeter * typetOfLog;
                numberOfLogs = truckMaximumWeight / weightOfLog;

                // output
                System.out.println("The truck can carry " + numberOfLogs
                                   + " logs that are " + typetOfLog
                                   + " meters long.");
            } else {
                System.err.println("Not a valid input");
            }

        } catch (Exception NumberFormatException) {
            System.err.println("Please enter a number");
        }
    }
}
