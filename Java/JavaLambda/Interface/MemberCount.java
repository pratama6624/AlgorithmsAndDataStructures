package JavaLambda.Interface;

@FunctionalInterface
public interface MemberCount<T> {
    public int count(T[] member);
}