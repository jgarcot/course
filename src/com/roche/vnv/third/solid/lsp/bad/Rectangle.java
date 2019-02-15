package com.roche.vnv.third.solid.lsp.bad;

public class Rectangle {

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }
}

class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }
}

class Demo {

    public void calculateArea(Rectangle r) {
        //
        // Assert Area
        //
        // From the code, the expected behavior is that
        // the area of the rectangle is equal to 6
        //
        if (r.getArea() != 6) throw new AssertionError("Invalid rectangle area");

    }
}

class Main {

    public static void main(String[] args) {
        final Demo demo = new Demo();

        final Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setLength(3);

        demo.calculateArea(rectangle);

        final Square square = new Square();
        square.setLength(2);
        square.setWidth(2);
        demo.calculateArea(square);
    }
}
