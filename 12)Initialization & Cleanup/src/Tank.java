/*
Exercise 12: (4) Create a class called Tank that can be filled and emptied, and has a
termination condition that it must be empty when the object is cleaned up. Write a
finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
that can occur when your Tank is used.
 */
public class Tank {
    private int n;
    public  void fill(int a) {
        n += a;
    }
    public void fill() {
        n++;
    }
    public void emptie() {
        n = 0;
    }
    @Override
    protected void finalize(){
        if (n != 0) {
            System.out.println("Error: delete");
        }
        else{
            System.out.println("delete");
        }
    }

    public static void main(String[] args) {
        new Tank().fill(10);
        new Tank();
        new Tank().fill();
        new Tank().fill(100);
        System.gc();

    }
}
