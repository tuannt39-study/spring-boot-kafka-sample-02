package vn.sapo.domain;

public class Bar2 {

    public String bar;

    public Bar2() {
        super();
    }

    public Bar2(String bar) {
        this.bar = bar;
    }

    public String getBar() {
        return this.bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Bar2{" +
                "bar='" + bar + '\'' +
                '}';
    }
}
