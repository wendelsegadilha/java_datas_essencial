import javax.xml.crypto.Data;
import java.util.Date;

public class AppDate {

    public static void main(String[] args) {

        //Trabalha com milissigundos desde 01/01/1970
        Date data = new Date(); //retorna a data atual
        System.out.println(data);

        //definir uma data
        data.setTime(785383200000L); //21-11-1994
        System.out.println(data);

        //pegando dia-mes-ano
        System.out.println(data.getDay());
        System.out.println(data.getMonth()+1);
        System.out.println(data.getYear());

        //verificando datas (maior ou menor)
        Date dataAtual  = new Date();
        System.out.println(dataAtual.after(data)); //maior (posterior)
        System.out.println(dataAtual.before(data)); //menor (inferior)

    }
}
