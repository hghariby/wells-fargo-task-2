package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId",  nullable = false, unique = true)
    private Client client;

    @Column (nullable = false)
    private String creationDate;

    @OneToMany (mappedBy = "portfolioId")
    private Security securities;

    protected Portfolio(){}

    public Portfolio(Client client, String Date, Security securities){
        this.client =client;
        this.creationDate = Date;
        this.securities = securities;
    }

    public Long getPortfolioId(){
        return portfolioId;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


}
