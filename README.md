# ejercicios-java
>[!CAUTION]
>
>es Metodo polimorfico --> Depends del objeto que se pase llamara a un metodo u otro
>
		barco.alarma();// Metodo polimorfico --> Depends del objeto que se pase llamara a un metodo u otro
				if (barco instanceof Velero) {
					//casting
					((Velero)barco).arriar();
				}
				if (barco instanceof Yate) {
					//casting
					((Yate)barco).lanzarBengala();
				}
>[!CAUTION]
>  **IMPORTANTE** mirar para exame teoria
