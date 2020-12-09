/*
Exercise 9: (1) Create a class with two (overloaded) constructors. Using this, call the
second constructor inside the first one.
 */
public class Runner {
    private int n,k,a;
    public Runner(int n, int k) {
        this.n = n;
        this.k = k;
        System.out.println("Runner 1");
    }

    public Runner(int n, int k, int a) {
        this(n,k);
        this.a = a;
        System.out.println("Runner 2");
    }
    public void setN(int n) {
        this.n = n;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getN() {
        return n;
    }

    public int getA() {
        return a;
    }

    public int getK() {
        return k;
    }

    public static void main(String[] args) {
        Runner obj = new Runner(1,2,3);
        System.out.println(obj.getN());
        System.out.println(obj.getA());
        System.out.println(obj.getK());
    }
}
