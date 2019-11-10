

public class RunnableFil implements Runnable {

	String strImprimir;
	public RunnableFil(String strP) {
		strImprimir=strP;
	}

	public void run(){
		for(int x=0;x<5;x++){
			System.out.println(strImprimir+ " " + x);
		}

	}

	public static void main(String[] args) {

		//Creem dos objecte de la classe RunnableFil
		RunnableFil objRunnable1 = new RunnableFil("Fil 1");
		RunnableFil objRunnable2 = new RunnableFil("Fil 2");
		RunnableFil objRunnable3 = new RunnableFil("Fil 3");
		RunnableFil objRunnable4 = new RunnableFil("Fil 4");
		RunnableFil objRunnable5 = new RunnableFil("Fil 5");
		RunnableFil objRunnable6 = new RunnableFil("Fil 6");
		RunnableFil objRunnable7 = new RunnableFil("Fil 7");
		RunnableFil objRunnable8 = new RunnableFil("Fil 8");
		RunnableFil objRunnable9 = new RunnableFil("Fil 9");
		RunnableFil objRunnable10 = new RunnableFil("Fil 10");
		//Creem dos Fils i li passem per paràmetres els objecte de la classe RunnableFil

		Thread primer = new Thread(objRunnable1);
		Thread segon = new Thread(objRunnable2);
		Thread tres = new Thread(objRunnable3);
		Thread quatre = new Thread(objRunnable4);
		Thread cinc = new Thread(objRunnable5);
		Thread sis = new Thread(objRunnable6);
		Thread set = new Thread(objRunnable7);
		Thread vuit = new Thread(objRunnable8);
		Thread nou = new Thread(objRunnable9);
		Thread deu = new Thread(objRunnable10);
		
		// Hem creat dos fils primer i segon, però no s’han executat.
		// Per poder−lo executar s’ha de cridar al mètode start()
		primer.run();
		segon.run();
		tres.run();
		quatre.run();
		cinc.run();
		sis.run();
		set.run();
		vuit.run();
		nou.run();
		deu.run();
		
		System.out.println("Final Fil Principal");
	}
}