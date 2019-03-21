package p1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Data {
	public static void main(String[] args) {
		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
		String dataFormatada = formatar.format(data);
		System.out.println(dataFormatada);
	}
}
