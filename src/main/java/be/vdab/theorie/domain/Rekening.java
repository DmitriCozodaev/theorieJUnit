package be.vdab.theorie.domain;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;
    public void stort(BigDecimal bedrag) {
        saldo = saldo.add(bedrag);
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
}
