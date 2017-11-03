public class Square extends GeometricObject {

    public float side;

    Square(float side){this.side = side;}

    public double getArea(){
        return side*side;
    }

    public void Display(){
        System.out.println("Square - " + side);
    }
}
