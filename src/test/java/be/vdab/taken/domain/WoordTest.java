package be.vdab.taken.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WoordTest {
    @Test
    void lepelIsEenPalindroom() {
        assertThat(new Woord("lepel").isPalindroom()).isTrue();
    }
    @Test
    void vorkIsGeenPalindroom() {
        assertThat(new Woord("vork").isPalindroom()).isFalse();
    }
    @Test
    void eenLegeStringIsEenPalindroom() {
        assertThat(new Woord("").isPalindroom()).isTrue();
    }
}
