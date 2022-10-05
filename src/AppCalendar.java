import java.util.Calendar;
import java.util.Date;

public class AppCalendar {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        Date data = c.getTime();
        System.out.println(data);

        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //dia da semana
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //dia do mes
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); //dia do ano
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //semana do mes

        //verificando dias
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        //adição e subtração de datas
        c.add(Calendar.DAY_OF_MONTH, -30); //retirando 30 dias a partir da data atual
        c.add(Calendar.HOUR, 1);
        Date data2 = c.getTime();
        System.out.println(data2);

        //recupera uma data atrasada em 60 dias a partir de uma data atual decrescida ou nao em dias
        Date dataLimite = getDataLimite(-10);
        System.out.println(dataLimite);

    }

    public static Date getDataLimite(int offsetDia){
        Calendar c = Calendar.getInstance();
        Date dataAtual = getDataAtual(offsetDia);
        c.setTime(dataAtual);
        c.add(Calendar.DAY_OF_MONTH, -60);
        return c.getTime();
    }

    public static Date getDataAtual(int offsetDia){
        Calendar c = Calendar.getInstance();
        if (offsetDia == 0){
            return c.getTime();
        }
        c.add(Calendar.DAY_OF_MONTH, offsetDia);
        return c.getTime();
    }

}
