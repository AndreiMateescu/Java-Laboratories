public class Circle extends GeometricObject{

    double radius;

    Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }

    public void Display(){
        System.out.println("Circle displayed of radius: " + this.radius);
    }
}
