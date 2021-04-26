
import com.h2.BestLoanRates;
import com.h2.MortgageCalculator;
import com.h2.SavingsCalculator;

import java.util.Arrays;
import java.util.Map;

public class Finance {

    public static final String BEST_LOAN_RATES = "bestLoanRates";
    public static final String SAVINGS_CALCULATOR = "savingsCalculator";
    public static final String MORTGAGE_CALCULATOR = "mortgageCalculator";

    public static final Map<String, String> commandsToUsage = Map.of(
            BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>"
    );

    public static void main(String[] args) {
        final String command = args[0];
        if (!commandsToUsage.containsKey(command)) {
            System.out.println(command + ": command not found");
            System.exit(-1);
        }

        final boolean isValidCommand = validateCommandArguments(args);
        if (!isValidCommand) {
            System.out.println(commandsToUsage.get(args[0]));
            System.exit(-1);
        }

        executeCommand(command, Arrays.copyOfRange(args, 1, args.length));
    }

    private static void executeCommand(String command, String[] arguments) {
        switch (command) {
            case BEST_LOAN_RATES:
                System.out.println("Finding best loan rates ..."); // for testing just log
                BestLoanRates.main(arguments); // for another test call these methods and have executeCommand add to main method
                return;
            case SAVINGS_CALCULATOR:
                System.out.println("Finding your net savings ...");
                SavingsCalculator.main(arguments);
                return;
            case MORTGAGE_CALCULATOR:
                System.out.println("Finding your monthly payment ...");
                MortgageCalculator.main(arguments);
        }
    }

    private static boolean validateCommandArguments(String[] args) {
        switch (args[0]) {
            case BEST_LOAN_RATES:
                return args.length == 1;
            case SAVINGS_CALCULATOR:
                return args.length == 3;
            case MORTGAGE_CALCULATOR:
                return args.length == 4;
        }
        return false;
    }
}
