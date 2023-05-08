public class Karte implements Comparable<Karte> {
    private final Cards.Values value;
    private final Cards.Symbols symbol;

    public Karte(Cards.Values value, Cards.Symbols symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public Cards.Values getValue() {
        return value;
    }

    public Cards.Symbols getSymbol() {
        return symbol;
    }

    @Override
    public int compareTo(Karte o) {
        int comp = compareSymbol(o);
        if (value.getValue() == 14) return -1;
        if (o.value.getValue() == 14) return 1;
        return switch (comp) {
            case 0 -> Integer.compare(o.value.getValue(),this.value.getValue());
            default -> comp;
        };
    }

    public int compareSymbol(Karte o) {
        if (this.symbol.getValue() == o.symbol.getValue()) return 0;
        return this.symbol.getValue() > o.symbol.getValue() ? -1 : 1;
    }
}
