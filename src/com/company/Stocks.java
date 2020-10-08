package com.company;

public class Stocks extends Product{
    String ticker;
    String Type = "Stocks";
    public Stocks(String product_id, double current_price, String ticker) {
        super(product_id, current_price);
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
