public class Convert {

    public String number;
    Convert(String number){this.number = number;}

    class ConvertToInt{

        public int getInt(String s){
            return Integer.parseInt(s);
        }
    }

    class ConvertToFloat{

        public float getFloat(String s){
            return Float.parseFloat(s);
        }
    }

    public void ConvertIntFloat(){
        ConvertToInt conv = new ConvertToInt();
        System.out.println(conv.getInt(number));

        ConvertToFloat convFloat = new ConvertToFloat();
        System.out.println(convFloat.getFloat(number));
    }

    public static void main(String[] args) {
        Convert convertor = new Convert("129");
        convertor.ConvertIntFloat();
    }
}
