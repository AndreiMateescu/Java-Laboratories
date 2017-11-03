public class Circle {

    private double radius;
    static int number = 0;

    void setRadius(double newRadius){
        try{
            if(newRadius < 0){
                //throw new IllegalArgumentException();
                throw new InvalidRadiusException();
            }
            this.radius = newRadius;
        }
        catch(IllegalArgumentException e){
            System.out.println("Negative radius");
        }
        catch(InvalidRadiusException e){

        }
    }

    Circle(double newRadius){
        setRadius(newRadius);
        number++;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle cerc1 = new Circle(3);
        Circle cerc2 = new Circle(-2);
    }
}
