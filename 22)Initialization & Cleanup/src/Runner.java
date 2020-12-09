/*
Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop
through the values( ) and print each value and its ordinal( ).

Exercise 22: (2) Write a switch statement for the enum in the previous example. For
each case, output a description of that particular currency.
 */
public class Runner {
    public enum Currency{
        BYN,USD,RUB,EUR,PLN,UAH;
    }

    public static void main(String[] args) {
        for(Currency s : Currency.values()){
            System.out.println(s + " " + s.ordinal());
            switch(s) {
                case BYN :
                    System.out.println("1 BYN");
                    break;
                case USD :
                    System.out.println("2,5 BYN");
                    break;
                case RUB :
                    System.out.println("0.03 BYN");
                    break;
                case EUR :
                    System.out.println("3 BYN");
                    break;
                case PLN :
                    System.out.println("0.1 BYN");
                    break;
                case UAH :
                    System.out.println("0.02 BYN");
                    break;
            }
        }

    }
}
