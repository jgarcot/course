package com.roche.vnv.third.solid.ocp.good;

public class AONResultCreator implements ResultCreator {

    @Override
    public Result create() {
        return new Result("1", "2");
    }
}
