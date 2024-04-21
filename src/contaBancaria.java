import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        String dadosCliente = "Fulano Ciclano Da Silva";
        String tipoDeConta = "Conta Corrente";
        double saldoDaConta = 2000.00;
        int escolhaInicialMenu = 0;
        double transferirValor;
        double receberValor;

        System.out.println("*********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + dadosCliente);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.println("Saldo inicial: R$ " + saldoDaConta);
        System.out.println("*********************************");

        String menuInicial = """
                   **     Operações    **
                   ** Digite sua opção **
                   1 - Consultar saldo
                   2 - Transferir valor
                   3 - Receber valor
                   4 - Sair
                   """;
        Scanner leitura = new Scanner(System.in);

        while (escolhaInicialMenu != 4){
            System.out.println(menuInicial);
            escolhaInicialMenu = leitura.nextInt();

            switch (escolhaInicialMenu){
                case 1:
                    System.out.println(" ");
                    System.out.println("Saldo da conta : R$ " + saldoDaConta);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.print(" Digite o valor a transferir: R$ ");
                    transferirValor = leitura.nextDouble();
                    if (saldoDaConta < transferirValor ){
                        System.out.println("Saldo Insuficiente");
                        break;
                    }
                    if (transferirValor < 0) {
                        System.out.println("Valor Invalido");
                        break;
                    }
                    saldoDaConta -= transferirValor;
                    System.out.print("Saldo atualizado da conta: R$ " + saldoDaConta);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.print("Digite o valor a ser recebido: R$ ");
                    receberValor = leitura.nextDouble();
                    if(receberValor < 0){
                        System.out.println("Valor Invalido");
                        break;
                    }
                    saldoDaConta += receberValor;
                    System.out.print("Saldo atualizado da conta: R$ " + saldoDaConta);
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("opção invalida");
            }
        }

    }
}