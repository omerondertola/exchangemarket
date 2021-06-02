package tr.com.tolaas.exchangemarket.entity;

import java.security.acl.Owner;
import java.time.LocalDate;

public class Stock {

    private StockType stockType;
    private StockOwner owner;
    private LocalDate publicOfferingDate;

    public StockType getStockType() {
        return stockType;
    }

    public void setStockType(StockType stockType) {
        this.stockType = stockType;
    }

    public StockOwner getOwner() {
        return owner;
    }

    public void setOwner(StockOwner owner) {
        this.owner = owner;
    }

    public LocalDate getPublicOfferingDate() {
        return publicOfferingDate;
    }

    public void setPublicOfferingDate(LocalDate publicOfferingDate) {
        this.publicOfferingDate = publicOfferingDate;
    }
}
