
public class UF2ACT5  extends Thread {

	String strImprimir;
	public UF2ACT5(String strP) {
		strImprimir=strP;
	}

	public void run(){
		for(int x=0;x<5;x++){
			System.out.println(strImprimir+" " + x);
		}
	}

	public static void main(String[] args) {

		Thread primer = new UF2ACT5("Fil 1");
		Thread segon = new UF2ACT5("Fil 2");
		Thread tres = new UF2ACT5("Fil 3");
		Thread quatre = new UF2ACT5("Fil 4");
		Thread cinc = new UF2ACT5("Fil 5");
		Thread sis = new UF2ACT5("Fil 6");
		Thread set = new UF2ACT5("Fil 7");
		Thread vuit = new UF2ACT5("Fil 8");
		Thread nou = new UF2ACT5("Fil 9");
		Thread deu = new UF2ACT5("Fil 10");
		// Hem creat dos fils primer i segon, però no s’han executat.
		// Per poder−lo executar s’ha de cridar al mètode start()
		primer.start();
		segon.start();
		tres.start();
		quatre.start();
		cinc.start();
		sis.start();
		set.start();
		vuit.start();
		nou.start();
		deu.start();

		System.out.println("Final Fil Principal");
	}
}