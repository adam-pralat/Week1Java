package uoft.csc207.week1;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"};
	    Person p = new Person(name, "moogah");
        Person s = new Student(name, "frooble", "123456789");
        System.out.println(p);
    }
}
