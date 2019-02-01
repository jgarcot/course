#**Example**

```
    1. Create a class Result with attributes: String value1, String value2
    2. Create an enum ResultType containing ie REGULAR, CALCULATED, EMBEDDED, CALIBRATOR,AON;
    3. Create a class ResultHandler handling above ResultTypes: depending on the ResultType assign different (random) values
```

I find the **Strategy Pattern** a great demonstration of the open/closed principle. Notice how in the bad example, any time we want to add a new result type, we have to change the ResultHandler class to accept a new type of Result.

Remember, **Software entitites should be open for extension, but closed for modification** 