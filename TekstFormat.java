import java.util.Locale;

public class TekstFormat {
    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł%n",accountBalance);

        // %[flags][width][.precision]conversion-character
        //s - strings
        //d - decimal integers
        //f - float points numbers
        //t - date/times
        //n -new line
        //bB - booleans

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"),"%.11f%n", pi);

    }
}
