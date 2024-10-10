class Shape{
    void calculateArea(){
        System.out.println("this is calculateArea method in shape class");
    }
}

class Circle extends Shape{
    float PI = 3.14f;
    int radius = 20;
    
    @Override
    void calculateArea(){
        System.out.println("PI : "+this.PI);
        System.out.println("radius : "+this.radius);
        System.out.println("Area of circle : "+(this.PI*(this.radius*this.radius)));
    }
}

class Rectangle extends Shape{
    int length = 10;
    int width = 20;
    
    @Override
    void calculateArea(){
        System.out.println("length : "+this.length);
        System.out.println("width : "+this.width);
        System.out.println("Area of Rectangle : "+(this.length*this.width));
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape circleObj = new Circle();
        circleObj.calculateArea();
        System.out.println("-----------------------------------------------------------");
        Shape rectangleObj = new Rectangle();
        rectangleObj.calculateArea();

        
        // Shape shapeObj = new Shape();
        // shapeObj.calculateArea();
        // Circle shape1Obj = (Circle) new Shape();      //error
        // Circle circle1Obj = new Circle();
        // circle1Obj.calculateArea();
    }
}
