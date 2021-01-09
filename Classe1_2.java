
import java.util.Scanner;


public class Classe1_2 {

public double lado, medidaLado, altura, area;

public void ler (Scanner leitor) {
    
    System.out.println("\n Digite a quantidade de lados do polígono:");
    lado= leitor.nextDouble();
    
    System.out.println("\n Digite a medida do lado:");
    medidaLado= leitor.nextDouble();
    
    System.out.println("\n Digite a altura:");
    altura= leitor.nextDouble();
}
public double calcular_exibir () {
        
    
   if (lado == 3) {
         
        area = medidaLado * altura;
        System.out.println("\n A area do polígono é: " + area +"");}
     
    else if (lado == 4) {
         
        area = medidaLado * altura;
        System.out.println("\n A area do polígono é:" + area +"");}
     
    else if (lado == 5) {
         
        area = medidaLado * altura;
        System.out.println("\n A area do polígono é:" + area +"");}
    
          
       return 0;
    
}
}

     


