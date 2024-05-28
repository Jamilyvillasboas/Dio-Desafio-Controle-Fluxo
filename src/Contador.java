import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro Parâmetro: ");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo Parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(" Erro: O segundo Parâmetro deve ser maior que o primeiro");
		}
        scanner.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(null);
        }else{
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
            } 
        }
		
    
	}
}