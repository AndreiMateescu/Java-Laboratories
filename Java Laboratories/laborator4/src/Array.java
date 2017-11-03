public class Array {

    public int [] myArray;
    public int size;

    Array(int n){
        myArray = new int[n];
        this.size = n;
        for(int i=0;i<n;i++)
            myArray[i] = i;
    }

    class ArrayIterator{

        public int iterator;

        ArrayIterator(){this.iterator = 0;}

        public boolean hasNext(){
            return iterator < Array.this.size;
        }

        public boolean hasPrevious(){
            return iterator > 0;
        }

        public int next(){
            if(hasNext()){
                return Array.this.myArray[++iterator];
            }
            return 0;
        }

        public int nextIndex(){
            return ++iterator;
        }

        public int previous(){
            if (hasPrevious()){
                return Array.this.myArray[--iterator];
            }
            return 0;
        }

        public int previousIndex(){
            return --iterator;
        }
    }

    public void PrintForeward(){
        ArrayIterator myArrayIterator = new ArrayIterator();
        while(myArrayIterator.hasNext()){
            System.out.println(myArray[myArrayIterator.iterator]);
            myArrayIterator.nextIndex();
        }
    }

    public void PrintBackward(){
        ArrayIterator myArrayIterator = new ArrayIterator();
        myArrayIterator.iterator = size;
        while(myArrayIterator.hasPrevious() && myArrayIterator.iterator >= 0){
            System.out.println(myArray[myArrayIterator.iterator]);
            myArrayIterator.previousIndex();
        }
    }

    public int firstMultiple(int k){
        for(int i=0;i<size;i++){
            if (myArray[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Array newArray = new Array(10);
        //newArray.PrintForeward();
        newArray.PrintBackward();
    }

}
