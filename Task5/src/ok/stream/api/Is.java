package ok.stream.api;

@FunctionalInterface
public interface Is<T> {
    boolean apply(T temp);
}
