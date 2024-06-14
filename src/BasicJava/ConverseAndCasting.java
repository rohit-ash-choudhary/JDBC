package BasicJava;
/*
n Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

 */
public class ConverseAndCasting {
    public static void main(String[] args) {
        int a = 3434;
        float b = 2.5f;


        int c = (int) b; /* this os explicit conversion  allowed in java */

        b = a; /* implicit conversion : this is allowed in java as we store small value in large variable
        data type
        */


    }
}
