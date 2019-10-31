package service.impl;

import service.CountValue;

/**
 * Some java docs
 */
public class MinusInteger implements CountValue<Integer, Integer> {

    @Override
    public Integer count(Integer a, Integer b) {
        return a-b;
    }
}
