import java.text.DecimalFormat;
import java.util.Scanner;

public class TempoChegada {
	public double veloMedia, distancia, tempo;
	Scanner sc = new Scanner(System.in);
	
	public void calculo() {
		System.out.println("Informe a distância do percurso: ");
		distancia = sc.nextDouble();
		System.out.println("");
		
		System.out.println("Informe a velocidade média: ");
		veloMedia = sc.nextDouble();
		System.out.println("");
		
		tempo = distancia / veloMedia;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println(df.format(tempo)+" Hora(s)");
	}
}
