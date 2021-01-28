package be.vdab.taken.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RechthoekTest {
    @Test
    void deOppervlakteVanEenRechtHoekVan5Op3Is15() {
        assertThat(new Rechthoek(5, 3).getOppervlakte()).isEqualTo(15);
    }
    @Test
    void deOmtrekVanEenRechtHoekVan5Op3Is16() {
        assertThat(new Rechthoek(5, 3).getOmtrek()).isEqualTo(16);
    }
}
