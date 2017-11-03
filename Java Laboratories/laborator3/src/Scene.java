public class Scene {
    static int numarElemente = 0;
    public GeometricObject[] arrayOfGeometrics = new GeometricObject[10];
    private int size = 10;

    void add(GeometricObject object){
        if(numarElemente < size){
            arrayOfGeometrics[numarElemente++] = object;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    void remove(int index){
        if(index < numarElemente){
            for(int i=index;i<arrayOfGeometrics.length;i++)
                arrayOfGeometrics[i-1] = arrayOfGeometrics[i];
        }
    }

    public static void main(String[] args) {
        Scene scene = new Scene();
        GeometricObject []objects = new GeometricObject[4];
        objects[0] = new Circle("black", true, 5.0);
        objects[1] = new Circle("black", true, 3.0);
        objects[2] = new Rectangle("black", true, 1.0, 1.0);
        objects[3] = new Rectangle("black", true, 2.0, 3.0);

        for(int i=0;i<objects.length;i++)
            scene.add(objects[i]);

        for(int i=0;i<objects.length;i++){
            scene.arrayOfGeometrics[i].Display();
            System.out.println(scene.arrayOfGeometrics[i].getArea());
        }

    }
}
