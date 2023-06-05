package ok.stream.api;

public interface Discriminant<T> {
    float apply(T temp1, T temp2, T temp3);
}