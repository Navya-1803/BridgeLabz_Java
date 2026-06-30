public class StockPortfolio {
    private Stock[] stock = new Stock[100];
    private int stockCount = 0;

    public void addStock(Stock stock){
        this.stock[stockCount] = stock;
        stockCount++;
    }

    public double calculateTotalPortfolioValue(){
        double totalPortfolioValue = 0.0;

        for(int i = 0; i<stockCount ; i++) {
            Stock currentStock = stock[i];
            double currentValue = currentStock.calculateStockValue();
            totalPortfolioValue += currentValue;
        }
        return totalPortfolioValue;
    }
}
