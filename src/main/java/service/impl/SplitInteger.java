package service.impl;

import service.CountValue;

public class SplitInteger implements CountValue<Integer, Integer> {
    @Override
    public Integer count(Integer a, Integer b) {
        return a/b;
    }
    //will test later
}
