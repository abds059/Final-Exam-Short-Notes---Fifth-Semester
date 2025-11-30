// Adapter Pattern Example 

class Rectangle {
    public double length;
    public double width;
}

class Calculator {
    public double getArea ( Rectangle rect) {
        return rec.length * rect.width;
    }
}

class Triangle {
    public double base;
    public double height;
    public Triangle (int b, int h) {
        this.base = b;
        this.height = h;
    }
}

class Calculator Adapter {
    public double getArea (Triangle triangle) {
        Calculator c = new Calculator ();
        Rectangle rect = new Rectangle ();
        
        // Area of Triangle = 0.5 * base * height
        rect.length = triangle.base;
        rect.width = 0.5 * triangle.height;

        return c.getArea (rect);
    }
}

class AdapterPatternExample {
    public static void main (Strings[] args) {
        CalculatorAdapter calculatoradapter = new CalculatorAdapter;
        Triangle t = new Triangle (20, 10);

        System.out.print ("Area of triangle is " + calculatoradapter.getArea (t) + "Square Unit");
    }
}