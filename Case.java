import java.util.Scanner;
public class Case{
    public static void main(String[] args) {
        
        int valor;
        Scanner lendo=new Scanner(System.in);

        System.out.println("DIgite de 1, 2 ou 3:");
        valor = lendo.nextInt();
                
        switch (valor) {
            case 1:
                System.out.println("valor = 1");
                break;

            case 2:
                System.out.println("valor = 2");
                break;
            case 3:
                System.out.println("valor = 3");
                break;
            default:
            System.out.println("Nenhum dos 3 valores");;

        }
    }
}