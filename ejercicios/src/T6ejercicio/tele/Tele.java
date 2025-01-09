package T6ejercicios.tele;

public class Tele {

	private int canalEsta=1;
	private String nSerie;
	private double tamanioPulgada;
	private int nCabales;
	private int nVolumen=10;
	private int volumenMax=30;
	private int volumenEsta;
	private boolean encendido=false;
	
	
	
	// Construcores 
	public Tele(String nSerie, double tamanioPulgada, int nCabales) {
		this.nSerie = nSerie;
		this.tamanioPulgada = tamanioPulgada;
		this.nCabales = nCabales;
	}

// getters y setters

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public double getTamanioPulgada() {
		return tamanioPulgada;
	}

	public void setTamanioPulgada(double tamanioPulgada) {
		this.tamanioPulgada = tamanioPulgada;
	}

	public int getnCabales() {
		return nCabales;
	}

	public void setnCabales(int nCabales) {
		this.nCabales = nCabales;
	}

	public int getnVolumen() {
		return nVolumen;
	}

	public void setnVolumen(int nVolumen) {
		this.nVolumen = nVolumen;
	}

	public int getVolumenMax() {
		return volumenMax;
	}

	public void setVolumenMax(int volumenMax) {
		this.volumenMax = volumenMax;
	}

	public int getOlumenEsta() {
		return volumenEsta;
	}

	public void setOlumenEsta(int volumenEsta) {
		this.volumenEsta = volumenEsta;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public int getCanalEsta() {
		return canalEsta;
	}

	public void setCanalEsta(int canalEsta) {
		this.canalEsta = canalEsta;
	}
	
	@Override
	public String toString() {
		return "Tele con número de serie  "+ nSerie+" que tiene " + nCabales+" canales como máximo y con volumen maximo de "+volumenMax
				+" ¿esta apagada? "+encendido+", con un volumen de nivel " + nVolumen + " y en el canal "+ canalEsta ;
	}
	
	// controles aplicación
//encender y apagar
	public void encenderTele() {
		encendido=true;
		System.out.println("Tele encendida en el canal " + canalEsta);
	}
	
	public void apagatTele() {
		encendido=false;
		System.out.println("Tele apagada");
		canalEsta=1;
	}
//Cambiar canales
	public void canalArriba() {
	    if (encendido) { // Comprueba si la TV está encendida
	        if (canalEsta < nCabales) {
	            canalEsta++; // Incrementa el canal si no está en el último
	            System.out.println("Canal "+ canalEsta);
	        } else {
	            canalEsta = 1; // Vuelve al canal 1 si está en el último
	            System.out.println("Canal "+ canalEsta);
	        }
	    } else {
	        System.out.println("No puedes cambiar de canal porque la televisión está apagada."); // Mensaje más claro
	    }
	}

	public void canalAbajo() {
		 if (encendido) { // Comprueba si la TV está encendida
		        if (canalEsta>1) {
		            canalEsta--; // dieminuimos el canal si no está en el primero
		        } else {
		            canalEsta = nCabales; // Vuelve al canal ultimo si está en el primerp
		        }
		    } else {
		        System.out.println("No puedes cambiar de canal porque la televisión está apagada."); // Mensaje más claro
		    }
		}
	
	public void irCanal(int canalUser) {
		if (encendido) { // Comprueba si la TV está encendida
	        if (canalUser>nCabales) {  //si no existe ese canal
	        	canalEsta=nCabales;  // Se pone el ultimo disponible
	        	System.out.println("Canal "+ canalEsta);
	        } else {
	            canalEsta=canalUser;
	            System.out.println("Canal "+ canalEsta);
	        }
	    } else {
	        System.out.println("No puedes cambiar de canal porque la televisión está apagada."); // Mensaje más claro
	    }	
	}
//subre y bajar Volumen
	public void subirVolumen() {
        if (encendido) {
            nVolumen += 5; // Incrementa el volumen en 5
            if (nVolumen <= volumenMax) {
                System.out.println("Volumen " + nVolumen);
            } else {
                nVolumen = volumenMax; // Asegura que no exceda el máximo
                System.out.println("Volumen máximo: " + nVolumen);
            }
        } else {
            System.out.println("No puedes ajustar el volumen porque la televisión está apagada.");
        }
    }

    public void bajarVolumen() {
        if (encendido) {
            nVolumen -= 5; // Reduce el volumen en 5
            if (nVolumen >= 0) {
                System.out.println("Volumen " + nVolumen);
            } else {
                nVolumen = 0; // Asegura que no baje de 0
                muteOn();
            }
        } else {
            System.out.println("No puedes ajustar el volumen porque la televisión está apagada.");
        }
    }
    //Mute
    public void muteOn() {
        if (encendido) {
            volumenEsta = nVolumen; // Guarda el volumen actual
            nVolumen = 0; // Silencia el volumen
            System.out.println("Volumen silenciado: " + nVolumen);
        } else {
            System.out.println("No puedes silenciar porque la televisión está apagada.");
        }
    }

    public void muteOff() {
        if (encendido) {
            nVolumen = volumenEsta; // Restaura el volumen guardado
            System.out.println("Volumen restaurado: " + nVolumen);
        } else {
            System.out.println("No puedes restaurar el volumen porque la televisión está apagada.");
        }
    }
    
	
	
	
	
}
