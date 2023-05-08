public class Karte {
    private final Cards.Values value;
    private final String symbol;

    public Karte(Cards.Values value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public Cards.Values getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
}
