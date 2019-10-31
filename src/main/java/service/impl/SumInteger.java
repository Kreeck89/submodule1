package service.impl;

import service.CountValue;

/**
 * Will write later
 */
public class SumInteger implements CountValue<Integer, Integer> {
    @Override
    public Integer count(Integer a, Integer b) {
        return a+b;
    }
}
