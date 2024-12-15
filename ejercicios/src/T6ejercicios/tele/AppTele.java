package T6ejercicios.tele;

public class AppTele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tele tele =new Tele("12Ar5", 24,50);
		
        System.out.println(tele.toString());
		tele.encenderTele();
		tele.canalArriba();
		tele.irCanal(2220);
		tele.irCanal(15);
		tele.subirVolumen();
		tele.subirVolumen();
		tele.bajarVolumen();
		tele.bajarVolumen();
		tele.bajarVolumen();
		tele.bajarVolumen();
		tele.bajarVolumen();
		tele.muteOff();
	}


	
}
