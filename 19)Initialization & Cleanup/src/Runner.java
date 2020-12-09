/*
Exercise 19: (2) Write a method that takes a vararg String array. Verify that you can
pass either a comma-separated list of Strings or a String[] into this method.
 */
public class Runner {
    public void print(String[] a){
        int size = a.length;
        for(int i = 0; i< size; i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Runner obj = new Runner();
        String[] a = new String[3];
        a[0] = "as";
        a[1] = "asdf";
        a[2] = "asdfgh";
        obj.print(a);
        obj.print(new String[]{"qw", "qwer", "qwerty"});


    }
}
