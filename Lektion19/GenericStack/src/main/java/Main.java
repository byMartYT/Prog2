public class Main {
    public static void main(String[] args) {
        StackVererbung<String> s = new StackVererbung<>();
        s.push("Hallo");
        s.push("Welt");
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
