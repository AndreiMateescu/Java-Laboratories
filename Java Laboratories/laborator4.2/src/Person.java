import java.util.Scanner;

public class Person {

    public String name;
    public String CNP;

    Person(){
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        CNP = scanner.nextLine();
    }

    public boolean Verify(){

        class CheckPerson{

            public char[] nume = name.toCharArray();
            public char[] cnp = CNP.toCharArray();

            public boolean Check(){
                return (nume[0] >= 65 && nume[0] < 97 && cnp.length == 13 && (cnp[0] == '1' || cnp[0] == '2'));
            }
        }
        CheckPerson checkPerson = new CheckPerson();
        return checkPerson.Check();
    }

    //public static void main(String[] args) {
        //Person person = new Person();
        //System.out.println(person.Verify());
    //}
}
