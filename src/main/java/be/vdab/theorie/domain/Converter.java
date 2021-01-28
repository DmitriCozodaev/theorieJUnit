package be.vdab.theorie.domain;

import java.math.BigDecimal;

public class Converter {
    private static final BigDecimal AANTAL_CENTIMETER_IN_EEN_INCH = BigDecimal.valueOf(2.54);
    public BigDecimal inchesNaarCentimeters(BigDecimal inches) {
        return inches.multiply(AANTAL_CENTIMETER_IN_EEN_INCH);
    }
}
