public class Runner {
    public static void main(String[] args) {
        new Tank().fill(10);
        new Tank();
        new Tank().fill();
        new Tank().fill(100);
        System.gc();
    }
}
