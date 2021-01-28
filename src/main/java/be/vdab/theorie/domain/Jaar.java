package be.vdab.theorie.domain;

public class Jaar {
    private final int jaar;
    public Jaar(int jaar) {
        this.jaar = jaar;
    }
    public boolean isSchrikkeljaar() {
        return jaar % 4 == 0 && jaar % 100 != 0 || jaar % 400 == 0;
    }
    @Override
    public String toString() {
        return String.valueOf(jaar);
    }
}
