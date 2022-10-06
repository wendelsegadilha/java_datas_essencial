import java.text.NumberFormat;
import java.util.Locale;

public class AppNumberFormat {

    public static void main(String[] args) {

        Locale locale1 = new Locale("pt", "BR");
        Locale locale2 = new Locale("pt", "CV");
        Locale locale3 = new Locale("en", "US");

        NumberFormat nb1 = NumberFormat.getInstance(locale1);
        NumberFormat nb2 = NumberFormat.getInstance(locale2);
        NumberFormat nb3 = NumberFormat.getInstance(locale3);

        Double valor = 1000_000_000.5487;

        System.out.println(nb1.format(valor));//1.000.000.000,549
        System.out.println(nb2.format(valor));//1 000 000 000,549
        System.out.println(nb3.format(valor));//1,000,000,000.549

    }
}
