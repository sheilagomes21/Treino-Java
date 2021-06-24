package sheila;
//Parei no video em 1:11:51 segundos
public class Sheila {
    public static void main (String[] args) {
        //if - condicional= Serve pra verificar uma condição - Faz uma pergunta, um hardware ou software
        // if = se
        //else = senão
        //simulação de uma pergunta:

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        }
        else {
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
    public static void calcularAreaModoExtenso(){
        System.out.println("Calcular Areas Modo Extenso");
        int largura;
        int comprimento;
        int resultado;
        largura = 45;
        comprimento = 35;
        resultado = largura * comprimento;
        System.out.println(" O resultado de " + largura +  " e " + comprimento + " é " +  resultado + "m²");
    }
    // Calculo de área reduzido


    }





