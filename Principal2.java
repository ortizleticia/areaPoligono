
import java.util.Scanner;

public class Principal2 {
    
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner (System.in);
    
    Classe1_2  c1_2 = new Classe1_2 ();
    
     int tecla = 0;
    while (tecla!=2) {
        
    System.out.format("\n 1 Calcular área do polígono \n 2 Sair");
    tecla= leitor.nextInt();
    switch (tecla){
            
        case 1: c1_2. ler (leitor);
        System.out.format("\n ", c1_2.calcular_exibir ());
        break;
            
        case 2: System.out.println ("\n Programa finalizado");
        System.exit (0);
        break;}
    }
    }
    }
    