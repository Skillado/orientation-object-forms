package desafiopackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {

    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int formaEscolhida = lerFormaGeometrica();
        FormaGeometrica formaGeometrica = criarFormaGeometrica(formaEscolhida);
        if(formaGeometrica != null) {
            System.out.printf("%s com área de %.1f\n", formaGeometrica.getNomeForma(), formaGeometrica.calculaArea());
        } else {
            System.out.println("Ocorreu um erro.");
        }

        scanner.close();
    }

    private static FormaGeometrica criarFormaGeometrica(int formaEscolhida) {
        switch(formaEscolhida) {
            case 1: //Quadrado
                int lado = lerUmaMedida("Informe a medida do lado do quadrado:");
                return new Quadrado(lado);
            case 2: //Triângulo
                int altura = lerUmaMedida("Informa a altura do triângulo:");
                int base = lerUmaMedida("Informa a base do triângulo:");
                return new Triangulo(base, altura);
            case 3: //Círculo
                int raio = lerUmaMedida("Informe o raio do círculo:");
                return new Circulo(raio);
            default:
                return null;
        }
    }

    private static int lerUmaMedida(String textoInformativo) {
        limparBuffer();
        int medida = 0;
    
        try {
            while(medida == 0) {
                System.out.println("***************************");
    
                System.out.println(textoInformativo);
    
                medida = scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            exibeMensagemDeErro("Valor inválida! Digite um número maior que 0.");
            lerUmaMedida(textoInformativo);
        }

        return medida;
    }

    private static int lerFormaGeometrica() {
        int formaGeometrica = 0;
    
        try {
            while(formaGeometrica != 1 && formaGeometrica != 2 && formaGeometrica != 3) {
                System.out.println("***************************");
    
                System.out.println("Informe a forma geométrica");
                System.out.println("1 - Quadrado");
                System.out.println("2 - Triângulo");
                System.out.println("3 - Círculo");
    
                formaGeometrica = scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            exibeMensagemDeErro("Opção inválida! Digite uma opção válida.");
            lerFormaGeometrica();
        }

        return formaGeometrica;
    }

    private static void exibeMensagemDeErro(String mensagem) {
        try {
            limparBuffer();

            System.out.println(mensagem);
            Thread.sleep(1000);
        } catch (InterruptedException ex) { }
    }

    private static void limparBuffer() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}