import java.util.Scanner;

public class Menu {

    public static void decideLista(int lista){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repete;

        do{
            System.out.print("Insira a lista que deseja ver: ");
            decideLista(sc.nextInt());
            System.out.print("Digite Sim se quiser ver outra lista: ");
            repete = sc.next();
        }while (repete.equals("Sim"));

    }
}
