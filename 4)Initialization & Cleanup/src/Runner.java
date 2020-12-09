/*
Exercise 3: (1) Create a class with a default constructor (one that takes no arguments)
that prints a message. Create an object of this class.

Exercise 4: (1) Add an overloaded constructor to the previous exercise that takes a
String argument and prints it along with your message.
 */
public class Runner {
    public Runner () {
        System.out.println("New obj");
    }
    public Runner (String str) {
        System.out.println("New obj " + str);
    }
    public static void main(String[] args) {
        Runner obj1 = new Runner();
        Runner obj2 = new Runner("Obj2");
    }
}
