package com.burcuerdogan.retrofitjava.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    public String currency;
    @SerializedName("logo_url")
    public String logo_url;
    @SerializedName("price")
    public String price;

    public CryptoModel(){}
    public CryptoModel (String currency, String price, String logo_url) {
        this.currency = currency;
        this.price = price;
        this.logo_url = logo_url;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
