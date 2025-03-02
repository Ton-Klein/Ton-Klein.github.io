// classe criada para analisar a pilha de execução.

public class Fluxo {

	public static void main(String[] args) {
		
		System.out.println("Inicio do metodo MAIN");
		
		try {	
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exceção " + msg);
			ex.printStackTrace();
		}
		
		System.out.println("Fim do metodo MAIN");		
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		
		ArithmeticException exception = new ArithmeticException("Deu ruim!"); // é possível passar uma mensagem personalizada de erro como parâmetro da exceção.
		// ou diretamente throw new ArithmeticException();
		throw exception;
		
		//System.out.println("Fim do metodo2"); // comentado para o exemplo compilar.
	}
}
