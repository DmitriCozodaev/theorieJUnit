package be.vdab.taken.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class VeilingTest {
    @Test
    void hetHoogsteBodVanEenNieuweVeilingIs0€() {
        assertThat(new Veiling().getHoogsteBod()).isZero();
    }
    @Test
    void naEenBodVan10€IsHetHoogsteBod10€() {
        var veiling = new Veiling();
        veiling.doeBod(BigDecimal.TEN);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("10");
    }
    @Test
    void naEenBodVan1€En10€En1€IsHetHoogsteBod10€() {
        var veiling = new Veiling();
        veiling.doeBod(BigDecimal.ONE);
        veiling.doeBod(BigDecimal.TEN);
        veiling.doeBod(BigDecimal.ONE);
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo(("10"));
    }
}