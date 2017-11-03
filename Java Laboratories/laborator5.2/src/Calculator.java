public class Calculator {

    public int add(int a, int b){

        try{
            if (a + b > Integer.MAX_VALUE){
                throw new OverflowException();
            }

            if(a + b < Integer.MIN_VALUE){
                throw new UnderflowException();
            }
        }
        catch(OverflowException e){
            System.out.println("Overflow");
        }
        catch(UnderflowException e){
            System.out.println("Underflow");
        }
        return a + b;
    }

    public int divide(int a, int b){

        try{
            if (b == 0){
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e){
            System.out.println("Eroare");
        }
        return a/b;
    }

    public float average(int[] a){
        int sum = 0;
        for(int i=0;i<a.length-1;i=i+2)
            sum = sum + add(a[i],a[i+1]);

        return divide(sum,a.length);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2000000000,1000000000));
    }
}
