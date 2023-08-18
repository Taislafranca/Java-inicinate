import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args){
    double media;
    String nome;
    Scanner ent = new Scanner(System.in);
        System.out.println("RECOMENDAÇÃO BOLSA DE ESTUDOS");
        System.out.println("Digite o nome do aluno");
        nome= ent.next();
        System.out.println("Digite a media de " + nome + ":");
        media= ent.nextDouble();
      
        
        if (media >=9){System.out.println("Altamente recomendado");}
        
        
        else 
            if(media >=8){System.out.println("Fortemente recomendado");}
            
        else 
            if(media >=7){System.out.println("Recomendado");}
            
         
        else {System.out.println("Não Recomendado");}
        
        
    }
}