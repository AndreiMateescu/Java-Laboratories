public class Rectangle extends GeometricObject{

    public double width;
    public double height;

    Rectangle(String color, boolean filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*width+2*height;
    }

    public void Display(){
        System.out.println("Rectangle displayed of dimensions: " + this.width + " " + this.height);
    }
}
