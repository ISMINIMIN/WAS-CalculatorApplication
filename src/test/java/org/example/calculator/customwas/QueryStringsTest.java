package org.example.calculator.customwas;

import org.example.calculator.customwas.QueryStrings;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringsTest {
    @Test
    void creatTest() {
        QueryStrings queryStrings = new QueryStrings("operand1=11&operator=*&operand2=55");

        assertThat(queryStrings).isNotNull();
    }
}
