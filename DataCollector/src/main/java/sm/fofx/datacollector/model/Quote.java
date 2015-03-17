package sm.fofx.datacollector.model;

import java.util.Date;

/**
 * Model to encapsulate the quote for a given day for a ticker.
 * Created on 3/17/2015.
 */
public class Quote {
    private String ticker;
    private Date date;
    private double closingPrice;
    private double openingPrice;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(double openingPrice) {
        this.openingPrice = openingPrice;
    }
}
