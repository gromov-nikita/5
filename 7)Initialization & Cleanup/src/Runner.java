/*
Exercise 7: (1) Create a class without a constructor, and then create an object of that
class in main( ) to verify that the default constructor is automatically synthesized
 */

public class Runner {
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        Runner obj = new Runner();
        System.out.println(obj.getN());
        obj.setN(10);
        System.out.println(obj.getN());
    }
}
