package com.smalaca.online.domain;

import java.math.BigDecimal;

public record Price(BigDecimal value, Currency currency) {
}
