package com.mashibing.function;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
