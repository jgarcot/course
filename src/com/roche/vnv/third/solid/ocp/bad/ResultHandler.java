package com.roche.vnv.third.solid.ocp.bad;

public class ResultHandler {

    public Result handle(ResultType resultType)  {

        switch(resultType) {
            case AON:
                return new Result("1", "2");
            case REGULAR:
                return new Result("3", "4");
            //what happens if I need to include another ResultType? Is this extensible?
            //Software entitites should be open for extension, but closed for modification
            default:
                break;

        }
        return null;

    }
}
