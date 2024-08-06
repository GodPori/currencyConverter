import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("in 1403/5/16 our available currencies are : \n 1 = Dollar \n 2 = Euro \n 3 = Derham \n Please enter which currency you wanna to buy :");
        String currency = scanner.next();

        int numberOfCurrency = 0;

        //I prefer to use switch-case instead of if-else for better response

        switch (currency.toLowerCase()) {
            case "dollar":
                System.out.println("you choose DOLLAR currency. \n how many DOLLARS you want to buy :");
                numberOfCurrency = scanner.nextInt();
                dollarExchange(numberOfCurrency);
                break;
            case "euro":
                System.out.println("you choose EURO currency.\n how many EUROS you want to buy :");
                numberOfCurrency = scanner.nextInt();
                euroExchange(numberOfCurrency);
                break;
            case "derham":
                System.out.println("you choose DERHAM currency.\n how many DERHAMS you want to buy :");
                numberOfCurrency = scanner.nextInt();
                derhamExchange(numberOfCurrency);
                break;
            default:
                System.out.println("invalid currency please try again.");
        }

        scanner.close();
    }

    //For each currency I use difference methode to clean code

    public static void dollarExchange(int number) {
        final int dollarRate = 614900;
        double exchange = (double) number * dollarRate;
        System.out.println("You will need " + exchange + " rials for " + number + " dollars.");
    }

    public static void euroExchange(int number) {
        final int euroRate = 677500;
        double exchange = (double) number * euroRate;
        System.out.println("You will need " + exchange + " rials for " + number + " euros.");
    }

    public static void derhamExchange(int number) {
        final int derhamRate = 168390;
        double exchange = (double) number * derhamRate;
        System.out.println("You will need " + exchange + " rials for " + number + " derhams.");
    }
}