package com.company;

public class Futures extends Product {
    String contract_code;
    String contract_month;
    String contract_year;
    String Type = "Futures";
    public Futures(String product_id, double current_price, String contract_code, String contract_month, String contract_year) {
        super(product_id, current_price);
        this.contract_code = contract_code;
        this.contract_month = contract_month;
        this.contract_year = contract_year;
    }

    public String getContract_code() {
        return contract_code;
    }

    public void setContract_code(String contract_code) {
        this.contract_code = contract_code;
    }

    public String getContract_month() {
        return contract_month;
    }

    public void setContract_month(String contract_month) {
        this.contract_month = contract_month;
    }

    public String getContract_year() {
        return contract_year;
    }

    public void setContract_year(String contract_year) {
        this.contract_year = contract_year;
    }


}
