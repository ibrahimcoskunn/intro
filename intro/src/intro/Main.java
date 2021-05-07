package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);
		if (dolarBugun < dolarDun) {
			System.out.println("dolar düþtü ");
		} else if (dolarBugun > dolarDun) {
			System.out.println("dolar yukseldi resmi");
		} else {
			System.out.println("dolar esittri");

		}

		String[] krediler = { "hýzlý kredi", "mutlu emeklý kredi", "konut kredi", "cýftcý kredi", "msb kredi",
				"meb kredi", };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
	
				
	
		}									
	}


