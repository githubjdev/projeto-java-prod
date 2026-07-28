package m06_introducao_poo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String formatarData(Date data) {
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}

}
