package net.jetensky.cleancode.singleresponsibility.correct.eshop.dto;

import java.math.BigDecimal;

public class ShoppingCartItem {
  private BigDecimal price;

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
