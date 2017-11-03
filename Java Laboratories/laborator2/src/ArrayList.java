public class ArrayList {

    static int nrElemente = 0;
    private float a[];
    public int size;

    ArrayList(){
        a = new float[10];
        size = 10;
    }

    ArrayList(int dim){
        a = new float[dim];
        size = dim;
    }

    public void add(float value){
        if (nrElemente < size){
            a[nrElemente++] = value;
        }
        else{
            float b[] = new float[nrElemente];
            for(int i=0;i<nrElemente;i++)
                b[i] = a[i];

            a = new float[2*size];
            size = size*2;
            for(int i=0;i<nrElemente;i++)
                a[i] = b[i];
            a[nrElemente++] = value;
        }
    }

    public boolean contains(float value){
        for(int i=0;i<a.length;i++){
            if (a[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index){
        if (index >= nrElemente){
            System.out.println("Index invalid");
        }
        else{
            for(int i=index;i<a.length;i++)
                a[i-1] = a[i];
        }
    }

    public float get(int index){
        return a[index];
    }

    public int size(){
        return nrElemente;
    }

    public String toString(){
        return "Vector size " + size() + ;
    }

    public static void main(String[] args) {

        ArrayList myArray = new ArrayList(5);
        myArray.add(45);
        myArray.add(11);
        myArray.add(10);
        myArray.add(1);
        myArray.add(99);
        myArray.add(1200);
        System.out.println(myArray.nrElemente + " " + myArray.size);

        myArray.remove(5);
    }
}
