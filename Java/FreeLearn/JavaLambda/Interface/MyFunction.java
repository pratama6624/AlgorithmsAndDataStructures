package FreeLearn.JavaLambda.Interface;

@FunctionalInterface
public interface MyFunction<R, P> {
    /**
     * @param value
     * @return
     */
    public R apply(P value);
}
