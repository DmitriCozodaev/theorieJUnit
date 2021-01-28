package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class RekeningTest {
    @Test
    void hetSaldoVanEenNieuweRekeningIs0€() {
        var rekening = new Rekening();
        assertThat(rekening.getSaldo()).isZero();
    }
    @Test
    void nadatJe10€StortIsHetSaldo10€() {
        var rekening = new Rekening();
        rekening.stort(BigDecimal.TEN);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("10");
    }
    @Test
    void nadatJe10€En1€StortIsHetSaldo11€() {
        var rekening = new Rekening();
        rekening.stort(BigDecimal.TEN);
        rekening.stort(BigDecimal.ONE);
        assertThat(rekening.getSaldo()).isEqualByComparingTo("11");
    }
}