package com.company;

public class Product  {
    private String product_id ;
    private String exchange;
    private double current_price ;
    private double value;

    public Product(String product_id, double current_price) {
        this.product_id = product_id;
        this.current_price = current_price;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id='" + product_id + '\'' +
                ", current_price=" + current_price +
                '}';
    }
}
