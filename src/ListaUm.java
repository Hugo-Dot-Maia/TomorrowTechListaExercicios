import java.util.Scanner;

public class ListaUm {


    private void exercicioDois(){
        System.out.println("--- Questão 2 ---");

        Scanner sc = new Scanner(System.in);
        double massa, altura, tempo;
        System.out.print("Informe a massa: ");
        massa = sc.nextDouble();
        System.out.print("Informe a altura: ");
        altura = sc.nextDouble();
        System.out.print("Informe o tempo: ");
        tempo = sc.nextDouble();

        System.out.println("Quantidade de Cavalos é: " + ((massa * altura / tempo ) / 745.6999));

        System.out.println("--- Fim Questão 2 ---");
    }

    private void exercicioUm(){
        System.out.println("--- Questão 1 ---");

        Scanner sc = new Scanner(System.in);
        double celcius;


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
        exercicioDois();
        System.out.println("----- Fim Lista 1 -----");
    }
}
