package T4ejercicios;

import java.util.Random;

public class AleatoriosRamdom {
	public static void main(String[] args) {
		
		Random aleatorio=new Random();
		int numeroMayor=0;
		for(int i=0;i<25;i++) {
			int aletorio1=aleatorio.nextInt(1,100)+1;
			if (aletorio1>numeroMayor) {
				numeroMayor=aletorio1;
			}
		}
		System.out.print("el numeo mayor es " + numeroMayor);
	}

}
