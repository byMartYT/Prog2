public class Cards {

    public enum Values {

        Sieben(7), Acht(8), Neun(9), Dame(10), Koenig(11), Zehn(12), Ass(13), Bube(14);

        private final int value;

        Values(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum Symbols{
        Herz(1), Karo(0), Pik(2), Kreuz(3);

        private final int value;

        Symbols(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
}
