/*
Exercise 5: (2) Create a class called Dog with an overloaded bark( ) method. This
method should be overloaded based on various primitive data types, and print different types
of barking, howling, etc., depending on which overloaded version is called. Write a main( )
that calls all the different versions.

Exercise 6: (1) Modify the previous exercise so that two of the overloaded methods have
two arguments (of two different types), but in reversed order relative to each other. Verify
that this works.
 */
public class Dog {
    public void bark(int n) {
        System.out.println("Uf " + n);
    }
    public void bark(char n) {
        System.out.println("gav " + n);
    }
    public void bark(double n) {
        System.out.println("Rrrr " + n);
    }
    public void bark(int n, double f) {
        System.out.println("Gav-Gav " + n + " " + f);
    }
    public void bark(double f, int n) {
        System.out.println("Rrrrr-gav " + f + " " + n);
    }
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark(100);
        obj.bark('q');
        obj.bark(0.1);
        obj.bark(100,0.1);
        obj.bark(0.1,100);
    }
}
