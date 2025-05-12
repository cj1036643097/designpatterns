package com.mashibing.payment.dto;

import java.math.BigDecimal;

public class PaymentRequest {
    private String tradeId;
    private BigDecimal amount;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
