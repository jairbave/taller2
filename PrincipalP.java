import java.util.Scanner;
 
public class PrincipalP {
     
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la base: ");
        int base = entrada.nextInt();
        
        System.out.print("Introduce el exponente: ");
        int exponente = entrada.nextInt();
        Potencia pot = new Potencia();
        
        int poten = pot.potencia(base, exponente);
        
        System.out.println(" LaPoencia es  " + poten);
    }
}