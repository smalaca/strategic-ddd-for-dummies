package com.smalaca.onlineshop.payments.domain;

import java.math.BigDecimal;

public record Price(BigDecimal value, Currency currency) {
}
