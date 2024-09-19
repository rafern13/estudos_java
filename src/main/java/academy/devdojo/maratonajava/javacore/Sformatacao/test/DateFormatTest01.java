package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();//14/06/2024 09:30

        df[1] = DateFormat.getDateInstance();//14 de jun. de 2024

        df[2] = DateFormat.getDateTimeInstance();//14 de jun. de 2024 09:30:10

        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);//14/06/2024

        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);//14 de jun. de 2024

        df[5] = DateFormat.getDateInstance(DateFormat.LONG);//14 de junho de 2024

        df[6] = DateFormat.getDateInstance(DateFormat.FULL);//sexta-feira, 14 de junho de 2024

        for (DateFormat dateFormat: df){
            System.out.println(dateFormat.format(calendar.getTime()));//calendar.getTime() retorna um Date!
        }
    }
}
