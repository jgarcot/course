package com.roche.vnv.third.solid.ocp.good;

public class Result {

    private final String value1, value2;

    public Result(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}
