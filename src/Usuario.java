import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variáveis da Tabuada
        int numeroTabuada = 0;
        int numeroTabuadaMax = 0;
        int i = 0;
        int resultadoTabuada = 0;

        //Variáveis soma, divisao, multi, divisao
        double numero1,numero2,resultado;

        //Variavel laço
        boolean continuar = true;

        while (continuar){
            System.out.println("Opções Válidas: Tabuada | Somar | Subtrair | Multiplicar | Dividir");
            System.out.print("Escreva a operação desejada: ");
            String operecao = scanner.nextLine();

            //Tabuada
            if (operecao.equalsIgnoreCase("tabuada")) {
                System.out.println("Você selecionou a operação Tabuada!");
                System.out.print("Informe qual o número da tabuada que deseja: ");
                numeroTabuada = scanner.nextInt();
                System.out.print("Agora informe até onde deseja contar a tabuada?: ");
                numeroTabuadaMax = scanner.nextInt();

                while (i <= numeroTabuadaMax){
                    resultadoTabuada = numeroTabuada * i;
                    System.out.println(numeroTabuada+" x "+i+" = "+ resultadoTabuada);
                    i++;
                }
                scanner.nextLine();
                //Somar
            } else if (operecao.equalsIgnoreCase("somar")) {
                System.out.println("Você selecionou a operação Somar!");
                System.out.print("Informe o primeiro número da soma: ");
                numero1 = scanner.nextDouble();
                System.out.print("Informe o segundo número da soma: ");
                numero2 = scanner.nextDouble();

                resultado = Calculos.soma(numero1,numero2);

                System.out.println("O resultado da soma dos números "+numero1+" + "+numero2+" é de: "+resultado);

                scanner.nextLine();
                //Subtrair
            } else if (operecao.equalsIgnoreCase("subtrair")) {
                System.out.println("Você selecionou a operação Subtrair!");
                System.out.print("Informe o primeiro número da subtração: ");
                numero1 = scanner.nextDouble();
                System.out.print("Informe o segundo número da subtração: ");
                numero2 = scanner.nextDouble();

                resultado = Calculos.subtracao(numero1,numero2);

                System.out.println("O resultado da subtração dos números "+numero1+" - "+numero2+" é de: "+resultado);

                scanner.nextLine();
                //Multiplicar
            } else if (operecao.equalsIgnoreCase("Multiplicar")) {
                System.out.println("Você selecionou a operação Multiplicar!");
                System.out.print("Informe o primeiro número da multiplicação: ");
                numero1 = scanner.nextDouble();
                System.out.print("Informe o segundo número da multiplicação: ");
                numero2 = scanner.nextDouble();

                resultado = Calculos.multiplicacao(numero1,numero2);

                System.out.println("O resultado da multiplicação dos números "+numero1+" x "+numero2+" é de: "+resultado);

                scanner.nextLine();
                //Divisao
            } else if (operecao.equalsIgnoreCase("dividir")) {
                System.out.println("Você selecionou a operação Dividir!");
                System.out.print("Informe o primeiro número da Divisão: ");
                numero1 = scanner.nextDouble();
                System.out.print("Informe o segundo número da Divisão: ");
                numero2 = scanner.nextDouble();

                resultado = Calculos.divisao(numero1,numero2);

                System.out.println("O resultado da divisão dos números "+numero1+" ÷ "+numero2+" é de: "+resultado);

                scanner.nextLine();
            } else {
                System.out.println("Infelizmente você digitou uma opção inválida!");
            }

            System.out.print("Deseja realizar outra operação? (S/N): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")){
                continuar = false;
                System.out.println("Obrigado por usar a calculadora! Até logo!");
            }

        }

    }
}
