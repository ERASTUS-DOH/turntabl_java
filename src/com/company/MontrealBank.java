package com.company;

import java.util.ArrayList;

public class MontrealBank<T extends Product> implements MontrealTradedProducts,ProductPricingService{
    ArrayList<T> tradedProducts = new ArrayList<>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if(tradedProducts.contains(product)){
            throw new ProductAlreadyRegisteredException();
        }else{
            tradedProducts.add((T) product);
        }
    }

    @Override
    public void trade(Product product, int quantity) {

    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }
}
