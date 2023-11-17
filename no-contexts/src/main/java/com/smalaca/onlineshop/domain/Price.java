package com.smalaca.onlineshop.domain;

import java.math.BigDecimal;

public record Price(BigDecimal value, Currency currency) {
}
