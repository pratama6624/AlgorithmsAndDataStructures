package FreeLearn.JavaLambda.Interface;

@FunctionalInterface
public interface MyConsumer<T> {
    /**
     * @param value
     */
    public void accept(T value);
}
