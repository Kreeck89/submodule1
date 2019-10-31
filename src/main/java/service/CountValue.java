package service;

@FunctionalInterface
public interface CountValue<A,B> {

    A count(A a, B b);
}
