package com.d2y.ecommerce.kafka;

import com.d2y.ecommerce.customer.CustomerResponse;
import com.d2y.ecommerce.order.PaymentMethod;
import com.d2y.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
