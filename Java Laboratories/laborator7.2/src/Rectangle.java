public class Rectangle extends GeometricObject {

    public float width;
    public float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }

    public void Display(){
        System.out.println("Rectangle - " + width + " " + height);
    }
}
