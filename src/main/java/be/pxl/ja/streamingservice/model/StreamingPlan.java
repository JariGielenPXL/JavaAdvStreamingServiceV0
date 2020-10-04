package be.pxl.ja.streamingservice.model;

import java.math.BigDecimal;

public enum StreamingPlan {
    BASIC(1,7.99),
    STANDAARD(2,11.99),
    PREMIUM(4,15.99);

    private int numberOfScreens;
    private double price; // moet BigDecimal zijn maar idk waarom

    StreamingPlan(int numberOfScreens, double price) {
        this.numberOfScreens = numberOfScreens;
        this.price = price;
    }
}
