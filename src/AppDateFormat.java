import java.text.DateFormat;
import java.util.Calendar;

public class AppDateFormat {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        /*
        Algumas formatações de data padrões
         */
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance(); //05/10/2022 20:35
        df[1] = DateFormat.getDateInstance(); //5 de out. de 2022
        df[2] = DateFormat.getDateTimeInstance(); //5 de out. de 2022 20:35:32
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); //05/10/2022
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); //5 de out. de 2022
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); //5 de outubro de 2022
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); //quarta-feira, 5 de outubro de 2022

        //Imprimindo datas formatadas
        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

    }

}
