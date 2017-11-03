public class Circle extends GeometricObject{

    public float radius;

    Circle(float radius){this.radius = radius;}

    public double getArea(){
        return 3.14*radius*radius;
    }

    public void Display(){
        System.out.println("Circle - " + radius);
    }
}
