package com.api.stock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String ticker;
    private String name;
    private String sector;
    private Double price;

    public Stock() {
    }

    public Stock(String ticker, String name, String sector, Double price) {
        this.ticker = ticker;
        this.name = name;
        this.sector = sector;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
