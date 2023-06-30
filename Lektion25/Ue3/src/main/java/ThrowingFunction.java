import java.util.function.Consumer;

//Schreiben Sie analog zum ThrowingFunction-Interface ein ThrowingConsumer-Interface.
public interface ThrowingFunction<T> extends Consumer<T> {
    @Override
    default void accept(T t) {
        try {
            acceptThrows(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void acceptThrows(T t) throws Exception;
}
