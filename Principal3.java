
import java.util.Scanner;

public class Principal3 {
    
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner (System.in);
    
    Classe1_3  c1_3 = new Classe1_3 ();
    
     int tecla = 0;
    while (tecla!=2) {
        
    System.out.format("\n 1 Calcular área do polígono \n 2 Sair");
    tecla= leitor.nextInt();
    switch (tecla){
            
        case 1: c1_3. ler (leitor);
        System.out.format("\n ", c1_3.calcular_exibir ());
        break;
            
        case 2: System.out.println ("\n Programa finalizado");
        System.exit (0);
        break;}
    }
    }
    }
    