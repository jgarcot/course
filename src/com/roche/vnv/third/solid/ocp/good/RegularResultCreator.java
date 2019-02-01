package com.roche.vnv.third.solid.ocp.good;

public class RegularResultCreator implements ResultCreator {

    @Override
    public Result create() {
        return new Result("3", "4");
    }
}
