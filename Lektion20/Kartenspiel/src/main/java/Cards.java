public class Cards {

    public enum Values {

        Eins(1), Zwei(2), Drei(3), Vier(4), Fuenf(5), Sechs(6), Sieben(7), Acht(8), Neun(9), Zehn(10), Bube(11), Dame(12), Koenig(13), Ass(14);

        private final int value;

        Values(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Symbols {
        HERZ("Herz"), KARO("Karo"), PIK("Pik"), KREUZ("Kreuz");

        private final String value;

        Symbols(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
