package com.tomlloyd;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 1.10, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 1.10, 7);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        sellItem(timsBasket, "Spanner", 5);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Juice", 4);
        sellItem(timsBasket, "Cup", 12);
        sellItem(timsBasket, "Bread", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return  0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem,  quantity);
            return quantity;
        }
        return 0;
    }
}
