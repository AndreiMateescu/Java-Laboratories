import java.util.ArrayList;

public class GeometricObject implements Comparable{

    public double getArea(){return 0;}

    public void Display(){

    }

    public int compareTo(GeometricObject o){
         if (this.getArea() > o.getArea())
             return 1;
         else if (this.getArea() == o.getArea())
             return 0;
         else
             return -1;
    }

    public static void maximumArea(ArrayList<? extends GeometricObject> list){
        int max = -100;
        for(int i=0;i<list.size();i++)
            if(list[i].getArea() > max)
                max = list[i].getArea();

        System.out.println(max);
    }

    public static void main(String[] args) {
        ArrayList<GeometricObject> arrayList = new ArrayList<GeometricObject>();
    }
}
