public class Square extends GeometricObject implements Colorable {

    public int side;

    public void HowToColor(){
        System.out.println("Colored square: " + this.color);
    }

    public double getArea(){
        return side*side;
    }

    public double getPerimeter(){
        return 2*side;
    }

    public void Display(){
        System.out.println("ads");
    }
}
