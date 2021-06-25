package sheila;

//import com.sun.deploy.panel.AbstractRadioPropertyGroup;

import java.util.Scanner;

//
public class Sheila {
    public static void main(String[] args) {

        //Utilizar a classe scaner para ler a esclha do usuário no console

        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P C Õ E S: ");
        System.out.println("c - CalcularAreaModoCurto ");
        System.out.println("e - CalcularAreaModoExtenso ");
        System.out.println("i - If Simples ");
        System.out.println("d - contarAteDez ");
        System.out.println("r - contagemRegressiva");
        System.out.println("Digite a opçao desejada: ");
        String opcao = scanner.next();

        //String opcao = "ifCurto";
        switch (opcao) {
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto!!");
                calcularAreaModoCurto();
                break;
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso!!");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu executar o método calcularAreaModoCurto!!");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contagemRegressiva");
                contagemregressiva();
                break;


        }
    }

    public static void ifSimples() {
        //if - condicional= Serve pra verificar uma condição - Faz uma pergunta, um hardware ou software
        // if = se
        //else = senão
        //simulação de uma pergunta:

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();

        }

        calcularAreaModoCurto();
        calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto() {
        System.out.println("Calcular Areas Modo curto");
        int largura = 40;
        int comprimento = 35;
        int resultado = largura * comprimento;
        System.out.println(" O resultado de " + largura + " e " + comprimento + " é " + resultado + "m²");
    }

    public static void calcularAreaModoExtenso() {
        System.out.println("Calcular Areas Modo Extenso");
        int largura;
        int comprimento;
        int resultado;
        largura = 45;
        comprimento = 35;
        resultado = largura * comprimento;
        System.out.println(" O resultado de " + largura + " e " + comprimento + " é " + resultado + "m²");
    }

    public static void contarAteDez() {


        //Loops ou Repetições
        // for = Retição incondiocional
        System.out.println("Contar até 10");
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

    public static void contagemregressiva() {

        System.out.println("Contagem Regressiva");
        for (int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }
    }
}





