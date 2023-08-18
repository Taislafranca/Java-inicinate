import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    double preco, aumento, novo_preco;
	    Scanner ent= new Scanner (System.in);
		System.out.println("Aumento de preco");
		
		System.out.println("Digite o preco, em R$");
		preco = ent.nextDouble();
		if (preco <=50){aumento = 0.05 * preco ;}
		else if (preco <=100){aumento = 0.10 * preco ;}
		else {aumento = 0.15 * preco ;}
		novo_preco = preco + aumento;
		System.out.printf("\nNovo preco: R$ %.2f", novo_preco);
		
		if (novo_preco <= 80){System.out.println(" - barato");}
		
		else if (novo_preco <=120){System.out.println(" - normal");}
		
		else if (novo_preco <=200){System.out.println(" - caro");}
		
		else {System.out.println(" - muito caro");} 
	}
}
