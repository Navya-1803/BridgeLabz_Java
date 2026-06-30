import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting OOPs Assignment");

        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();
        System.out.println("How many stocks do you wish to enter: ");
        int N = sc.nextInt();

        for (int i = 0; i <N ; i++){
            System.out.println("Enter name of the Stock: ");
            String name = sc.nextLine();
            System.out.println("Enter number of shares of the stock: ");
            int shares = sc.nextInt();
            System.out.println("Enter the price of the stock");
            double price = sc.nextDouble();
            Stock newStock = new Stock(name, shares, price);
            portfolio.addStock(newStock);
        }
        System.out.println("Total Stock Portfolio Value: " + portfolio.calculateTotalPortfolioValue());
    }
}
