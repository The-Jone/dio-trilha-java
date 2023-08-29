import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente = "Jhonattan Vieira";
        double saldo = 538.53;
        String cadastro = "";

        System.out.println("Você gostaria de criar uma conta bancária conosco? [S/N] ");
        cadastro = scanner.nextLine().toUpperCase();
        System.out.println();

        if ("S".equals(cadastro)){

            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine();
            if ("067-8".equals(agencia)){
                System.out.println();

                System.out.println("Por favor, digite o número da conta: ");
                numero = scanner.nextInt();
                if(numero == 1010){
                    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é " + saldo + " já está disponível para saque.");
                }
                else{
                    System.out.println();
                    System.out.println("O número da conta digitada está incorreto!");
                }
            }
            else{
                System.out.println();
                System.out.println("A agência digitada está incorreta!");
            }
        }
        else {
            System.out.println();
            System.out.println("Por favor, digite a letra correspondente corretamente!");
        }
        System.out.println();
        System.out.println("FIM!");
    }
}
