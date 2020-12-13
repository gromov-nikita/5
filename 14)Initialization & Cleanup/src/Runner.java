import java.sql.SQLOutput;

/*
Exercise 14: (1) Create a class with a static String field that is initialized at the point of
definition, and another one that is initialized by the static block. Add a static method that
prints both fields and demonstrates that they are both initialized before they are used.
 */
public class Runner {
    private static String str1 = "qwer";
    private static String str2;
    static{
        str2 = "ty";
    }
    public static void print() {
        System.out.println(str1);
        System.out.println(str2);
    }
    public static void main(String[] args) {
        print();
    }
}
