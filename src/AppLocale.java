import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AppLocale {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        Locale locale1 = new Locale("pt", "BR");
        Locale locale2 = new Locale("pt", "CV");
        Locale locale3 = new Locale("en", "US");

        //definindo estilo de formatação e localidade
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale1);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locale3);

        //data formatada de acordo com as localidades
        System.out.println(df1.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
        System.out.println(df3.format(c.getTime()));

    }

}
