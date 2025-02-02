package T4ejemplos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormateoNumeros {

	public static void main(String[] args) {
		
		
	/**Formateo con  NumberFormat**/
	
		double num1=0.0123;
		double num2=123456.89;
		
		//->Creamos formateador
			NumberFormat nf1=NumberFormat.getInstance();
			nf1.setMaximumFractionDigits(2);
		//Formatiemos lo dado con la plantilla
		System.out.println(nf1.format(num1));
		System.out.println(nf1.format(num2));
		
		
		//->Creamos formateador de moneda local
			NumberFormat nf2=NumberFormat.getCurrencyInstance();
			nf2.setMaximumFractionDigits(2);
		
		//Formatiemos lo dado con la plantilla
		System.out.println(nf2.format(num1));
		System.out.println(nf2.format(num2));
		
		//->Creamos formateador de moneda de localidad distinta
			NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);
			nf3.setMaximumFractionDigits(2);
				
		//Formatiemos lo dado con la plantilla
		System.out.println(nf3.format(num1));
		System.out.println(nf3.format(num2));
		
		//->Creamos formateador en formato porcentaje
			NumberFormat nf4=NumberFormat.getPercentInstance();
		
				
		//Formatiemos lo dado con la plantilla
		System.out.println(nf4.format(num1));

	System.out.println("-------------------");
		
		
	/**Formateo con DecimalFormat**/
		double num3=999666887777.654;
		double num4=.123;
		double num5= 12.56;
		double num6=-456.70;
		
		//Creacción de plantilla
		DecimalFormat df=new DecimalFormat();
				
		df.applyPattern("#,##0.00;(#,##0.00)");
		/** 
		 	df.applyPattern("#,##0.00") positivo
		 	df.applyPattern(";(#,##0.00)") negativo
		 */
		
		
		
		System.out.println(df.format(num3));
		System.out.println(df.format(num4));
		System.out.println(df.format(num5));
		System.out.println(df.format(num6));

		
	}

}
