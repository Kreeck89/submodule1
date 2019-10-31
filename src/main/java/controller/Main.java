package controller;

import service.impl.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Result is: " + new SumInteger().count(6, 4));
        System.out.println("Result is: " + new MinusInteger().count(6, 4));
        System.out.println("Result is: " + new MultiplyInteger().count(6, 4));
        System.out.println("Result is: " + new SplitInteger().count(6, 4));
        System.out.println("Result is: " + new SumString().count("6", "4"));

    }
}
