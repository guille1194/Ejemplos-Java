package ejemplos.guillermoNavarro.ciclos;

public class Ciclos {

	public static void main(String[] args) {
		int i = 0;
		while(true){
			i += 10;
			System.out.println("Valor while: " + i);
			if (i == 100){break;}
		}
		int contador = 0;
		do{
			System.out.println("Valor do while: " + (contador + 1));
			contador +=1;
		} while (contador < 10);
		
		for(int m = 100; m <= 120; m+=10){
			System.out.println("Valor for: " + m);
		}
	}
}
