import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
        }
		catch (ParametrosInvalidosException erro) {
			System.out.println();
			System.out.println("O segundo parametro deve ser maior que o primeiro!");
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm){
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;

        for (int x = 0; x < contagem; x++){
			System.out.println("Imprimindo o número: " + (x+1));
        }
		
	}
        
}