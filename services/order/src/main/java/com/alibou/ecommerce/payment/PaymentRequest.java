package com.d2y.ecommerce.payment;

import com.d2y.ecommerce.customer.CustomerResponse;
import com.d2y.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
