package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "portfolioId",  nullable = false, unique = true)
    private Portfolio portfolio;

    @Column (nullable = true)
    private String name;

    @Column (nullable = true)
    private String category;

    @Column (nullable = true)
    private Double purchasePrice;

    @Column (nullable = true)
    private String purchaseDate;

    @Column (nullable = true)
    private Integer quantity;

    protected Security(){}

    public Security( Portfolio portfolio, String name, String category, Double purchasePrice, String purchaseDate, Integer quantity){
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice ;
        this.purchaseDate =  purchaseDate;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getpurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

}
