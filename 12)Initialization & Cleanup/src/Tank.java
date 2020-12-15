/*
Exercise 12: (4) Create a class called Tank that can be filled and emptied, and has a
termination condition that it must be empty when the object is cleaned up. Write a
finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
that can occur when your Tank is used.
 */
public class Tank {
    private int n;
    public  void fill(int a) {
        if(a == 0){
            n = 0;
        }
        else {
            n+=a;
        }
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
}
