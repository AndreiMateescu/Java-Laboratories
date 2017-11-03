import java.util.ArrayList;

public class GenericStack<E> {

    private ArrayList<E> list = new ArrayList<E>();

    public int getSize(){
        return list.size();
    }

    public void push(E o){
        list.add(o);
    }

    public E peek(){
        //return list.get(list.size()-1);
        return list.get(0);
    }

    public E pop(){
        //E aux = list.get(list.size()-1);
        //list.remove(list.size()-1);
        //return aux;
        E aux = list.get(0);
        list.remove(0);
        return aux;
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<Integer>();
        stack.push(new Integer(10));
        stack.push(new Integer(21));
        stack.push(new Integer(1));

        //stack.push(2);
        Integer a = stack.pop();
        a = stack.peek();
        System.out.println(a);
    }
}
