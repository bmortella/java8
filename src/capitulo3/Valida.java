package capitulo3;

public class Valida {

	public static void main(String[] args) {
	
		/*
		 * Toda interface do Java que possui apenas um método abstrato pode
		 * ser instanciada como um código lambda. Logo, a interface Validador
		 * pode ser utilizada sem precisar modificar nada.
		 */
		
		Validador<String> validadorCEP = valor -> {return valor.matches("[0-9]{5}-[0-9]{3}");};
		
		validadorCEP.valida("04101-300");
		
		/*
		 * Podemos resurmir ainda mais o exemplo se livrando das chaves e
		 * até mesmo do return.
		 */
	
		validadorCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
	
		/*
		 * Você pode acessar as variáveis finais do método a qual você
		 * pertence.
		 */
		
		final int numero = 5;
		new Thread (() -> System.out.println("Numero = " + numero)).start();
		
		/*
		 * Você também pode acessar variáveis que não são finais
		 * porém não podem ser modificadas ao longo do código.
		 */
		
		//numero = 10; //O código acima não compila com essa linha.
		
		/* 
		 * O mesmo vale para classes anônimas a partir do Java 8. Você não
		 * precisa mais declarar as variáveis locais como final, basta não
		 * alterá-las que o Java vai permitir acessá-las.
		 */
		
	}
	
}
