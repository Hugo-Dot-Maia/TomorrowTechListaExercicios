import java.util.Scanner;

public class ListaUm {

    public void exercicioUm(){
        Scanner sc = new Scanner(System.in);
        double celcius;

        System.out.println("--- Questão 1 ---");
        System.out.print("Insira a temperatura em Celcius: ");
        celcius = sc.nextDouble();

        System.out.println("Kelvin: " + (celcius + 273.15));
        System.out.println("Fahrenheit: " + (celcius * 1.8 + 32));
        System.out.println("Rankine: " + (celcius * 1.8 + 32 + 459.67));
        System.out.println("Réaumur: " + (celcius * 0.8));

        System.out.println("--- Fim Questão 1 ---");

    }

    public void executaLista(){
        System.out.println("----- Lista 1 -----");
        exercicioUm();
        System.out.println("----- Fim Lista 1 -----");
    }
}
